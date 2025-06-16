package inge2.dataflow;

public class BusquedaLineal {

    // Busca un elemento en un arreglo de enteros.
    //
    //@ requires arr != null;
    //@ ensures (\result <==> (\exists int i; 0 <= i && i < arr.length; arr[i] == elem));
    public static boolean busquedaLineal(int elem, int[] arr) {
        boolean result = false;

        //@ loop_invariant 0 <= i && i <= arr.length;
        //@ loop_invariant result <==> (\exists int j; 0 <= j && j < i; arr[j] == elem);
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                result = true;
            }
        }

        return result;
    }
}