package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.HashSet;
import java.util.Set;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processCopy(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processStore(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processLoad(stmt);
        }
    }

    private void processNewObject(AssignStmt stmt) { // x = new A()
        String leftVariableName = stmt.getLeftOp().toString();
        Node nodeName = pointsToGraph.getNodeName(stmt);
        Set<Node> leftVariableNodes = new HashSet<>();
        leftVariableNodes.add(nodeName);

        this.pointsToGraph.setNodesForVariable(leftVariableName, leftVariableNodes);
    }

    private void processCopy(AssignStmt stmt) { // x = y
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        Set<Node> rightVariableNodes = pointsToGraph.getNodesForVariable(rightVariableName);
        pointsToGraph.setNodesForVariable(leftVariableName, rightVariableNodes);
    }

    private void processStore(AssignStmt stmt) { // x.f = y
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        Set<Node> leftVariableNodes = this.pointsToGraph.getNodesForVariable(leftVariableName);
        Set<Node> rightVariableNodes = this.pointsToGraph.getNodesForVariable(rightVariableName);

        for(Node leftNode : leftVariableNodes) {
            for(Node rightNode : rightVariableNodes) {
                this.pointsToGraph.addEdge(leftNode, fieldName, rightNode);
            }
        }
    }

    private void processLoad(AssignStmt stmt) { // x = y.f
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        // y -> n1 --f--> n2
        Set<Node> rightVariableNodes = this.pointsToGraph.getNodesForVariable(rightVariableName); // todo n1
        Set<Node> reachableNodesByRightVariable = new HashSet<Node>();
        for(Node rightNode : rightVariableNodes) {
            Set<Node> reachableNodesOfRightNode = this.pointsToGraph.getReachableNodesByField(rightNode, fieldName); // todo n2
            reachableNodesByRightVariable.addAll(reachableNodesOfRightNode);
        }

        // x -> n2
        this.pointsToGraph.setNodesForVariable(leftVariableName, reachableNodesByRightVariable);
    }
}
