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

        // si alguno es bottom entonces toda la suma es bottom
        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        // si alguno es top, la suma es top
        if (this.equals(TOP) || another.equals(TOP)) {return TOP;}

        // el cero es neutro en la suma, se devuelve el valor del que no sea zero
        if (this.equals(ZERO)) {return another;}
        if (another.equals(ZERO)) {return this;}

        // si soy negativo y le sumo un negativo, es negativo; si no, puede ser {-,0,+} = top
        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return NEGATIVE;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return TOP;}

        // si soy positivo y le sumo un positivo, es positivo; si no, puede ser {-,0,+} = top
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
        // si alguno de los dos es bottom, la division resultante es bottom
        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        // si se divide por 0 es bottom
        if (another.equals(ZERO)) {return BOTTOM;}
        // cero dividido por algo resulta 0 salvo que el otro sea top o bottom
        if (this.equals(ZERO) && !another.equals(NEGATIVE) && !another.equals(POSITIVE)) {return another;}
        if (this.equals(ZERO) && (another.equals(POSITIVE) || another.equals(NEGATIVE))) {return ZERO;}

        if (another.equals(TOP)) {return TOP;}
        if (this.equals(TOP)) {return TOP;}

        // si soy negativo y divido entre negativo, es positivo; si es positivo, da negativo
        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return POSITIVE;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return NEGATIVE;}

        // si soy positivo y divido entre positivo, es positivo; si es negativo, da negativo
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
        // si cualquiera de los dos es bottom el resultado es bottom
        if (this.equals(BOTTOM) || another.equals(BOTTOM)) {return BOTTOM;}

        // si alguno es cero la multiplicacion es zero
        if (this.equals(ZERO) || another.equals(ZERO)) {return ZERO;}

        // si alguno es top entonces el resultado sera top ya que no es posible determinar el signo
        if (another.equals(TOP) || this.equals(TOP)) {return TOP;}

        // si soy negativo y multiplico por negativo, es positivo; si es positivo, da negativo
        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return POSITIVE;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return NEGATIVE;}

        // si soy positivo y multiplico por positivo, es positivo; si es negativo, da negativo
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

        // el otro ya no puede ser ni top ni bottom, quedan analizar casos zero - positive, zero - negative
        if (this.equals(ZERO) && !another.equals(NEGATIVE)) {return another;}
        if (this.equals(ZERO) && another.equals(NEGATIVE)) {return POSITIVE;}
        if (another.equals(ZERO)) {return this;}

        // si soy negatvio y le resto un negativo (queda como suma), puede ser {-,0,+} = top; si no, es negativo
        if (this.equals(NEGATIVE) && another.equals(NEGATIVE)) {return TOP;}
        if (this.equals(NEGATIVE) && another.equals(POSITIVE)) {return NEGATIVE;}

        // si soy positivo y le resto un negativo (queda como suma), es positivo; si no, puede ser {-,0,+} = top
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

        // si alguno es top entonces la combinacion sera top ya que es el supremo
        if (this.equals(TOP)  || another.equals(TOP)) {return TOP;}

        // si alguno es bottom entonces se devuelve el valor del otro ya que cualquier cosa es el supremo de bottom (incluido bottom)
        if (this.equals(BOTTOM)) {return another;}
        if (another.equals(BOTTOM)) {return this;}

        // casos {+, -, 0}
        // si son iguales se devuelve a si mismo ya que uno es supremo de si mismo
        if (another.equals(this)) {return this;}
        // si no, es top ya que en este caso comparten el supremo.
        else return TOP;
    }
}
