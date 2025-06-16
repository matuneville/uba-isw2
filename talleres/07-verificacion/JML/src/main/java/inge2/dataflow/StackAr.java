package inge2.dataflow;

public class StackAr {

    /**
     * Capacidad por defecto de la pila.
     */
    private final static int DEFAULT_CAPACITY = 10;

    /**
     * Arreglo que contiene los elementos de la pila.
     */
    //@ spec_public
    private final int[] elems;

    /**
     * Indice del tope de la pila.
     */
    //@ spec_public
    private int top = -1;

    //@ requires true;
    //@ ensures elems.length == 10 && top == -1;
    public StackAr() {
        this(DEFAULT_CAPACITY);
    }

    //@ requires capacity > 0;
    //@ ensures elems.length == capacity && top == -1;
    public StackAr(int capacity) {
        this.elems = new int[capacity];
    }

    //@ requires true;
    //@ ensures \result <==> top == -1;
    //@ pure
    public boolean isEmpty() {
        return top == -1;
    }

    //@ requires true;
    //@ ensures \result <==> top == (elems.length - 1);
    //@ pure
    public boolean isFull() {
        return top == elems.length - 1;
    }

    //@ requires top < Integer.MAX_VALUE;
    //@ ensures \result == (top + 1);
    //@ pure
    public int size() {
        return top + 1;
    }

    //@ requires !this.isFull() && top < elems.length && top >= 0;
    //@ ensures elems[top] == o && (\forall int i; 0 <= i && i < top; elems[i] == \old(elems[i]));
    public void push(int o) {
        this.elems[++top] = o;
    }

    //@ requires !this.isEmpty() && top < elems.length && top >= 0;
    //@ ensures \result == elems[\old(top)] && (\forall int i; 0 <= i && i <= top; elems[i] == \old(elems[i]));
    public int pop() {
        return elems[top--];
    }

    //@ requires !this.isEmpty() && 0 <= top && top < elems.length && top >= 0;
    //@ ensures \result == elems[top] && (\forall int i; 0 <= i && i <= top; elems[i] == \old(elems[i]));
    public int peek() {
        return this.elems[top];
    }
}

