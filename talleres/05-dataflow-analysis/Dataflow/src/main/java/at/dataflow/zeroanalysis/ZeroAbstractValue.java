package at.dataflow.zeroanalysis;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is positive.
     */
    POSITIVE("positive"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable is negative.
     */
    NEGATIVE("negative"),

    /**
     * The variable is top (can be any value).
     */
    TOP("top");


    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {

        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        if (this.equals(TOP) || another.equals(TOP)) {return TOP;}

        if (this.equals(ZERO)) {return another;}
        if (another.equals(ZERO)) {return this;}

        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return NEGATIVE;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return TOP;}

        if (this.equals(POSITIVE) && another.equals(NEGATIVE)) {return TOP;}
        if (this.equals(POSITIVE) && another.equals(POSITIVE)) {return POSITIVE;}

        throw new UnsupportedOperationException();
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        if (another.equals(TOP)) {return BOTTOM;}
        if (this.equals(TOP)) {return TOP;}

        if (another.equals(ZERO)) {return BOTTOM;}
        if (this.equals(ZERO)) {return another;}

        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return POSITIVE;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return NEGATIVE;}

        if (this.equals(POSITIVE) && another.equals(NEGATIVE)) {return NEGATIVE;}
        if (this.equals(POSITIVE) && another.equals(POSITIVE)) {return POSITIVE;}

        throw new UnsupportedOperationException();
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        if (another.equals(TOP) || this.equals(TOP)) {return TOP;}

        if (this.equals(ZERO) || another.equals(ZERO)) {return ZERO;}

        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return POSITIVE;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return NEGATIVE;}

        if (this.equals(POSITIVE) && another.equals(NEGATIVE)) {return NEGATIVE;}
        if (this.equals(POSITIVE) && another.equals(POSITIVE)) {return POSITIVE;}

        throw new UnsupportedOperationException();
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue substract(ZeroAbstractValue another) {
        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        if (this.equals(TOP) || another.equals(TOP)) {return TOP;}

        if (this.equals(ZERO)) {return another;}
        if (another.equals(ZERO)) {return this;}

        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return TOP;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return NEGATIVE;}

        if (this.equals(POSITIVE) && another.equals(NEGATIVE)) {return POSITIVE;}
        if (this.equals(POSITIVE) && another.equals(POSITIVE)) {return TOP;}

        throw new UnsupportedOperationException();
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        if (this.equals(another)) {return this;}

        if (this.equals(TOP)  || another.equals(TOP)) {return TOP;}



        throw new UnsupportedOperationException();
    }

}
