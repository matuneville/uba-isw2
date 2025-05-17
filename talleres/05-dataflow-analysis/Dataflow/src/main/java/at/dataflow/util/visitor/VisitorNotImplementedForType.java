package at.dataflow.util.visitor;

/**
 * Exception thrown when a {@link soot.Value} sub-type is not implemented in {@link at.dataflow.util.visitor.AbstractValueVisitor}.
 */
public class VisitorNotImplementedForType extends RuntimeException {
    public VisitorNotImplementedForType(String name) {
        super(name);
    }
}
