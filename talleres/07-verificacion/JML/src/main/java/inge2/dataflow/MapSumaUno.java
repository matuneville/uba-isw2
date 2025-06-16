package inge2.dataflow;

public class MapSumaUno {

    // Suma uno a todos los elementos de un array.
    //
    //@ requires arr != null && (\forall int i; 0 <= i && i < arr.length; arr[i] != Integer.MAX_VALUE);
    //@ ensures (\forall int i; 0 <= i && i < arr.length; arr[i] == (\old(arr[i])+1));
    public static void mapSumaUno(int[] arr) {

        //@ loop_writes i, arr[*];
        //@ loop_invariant 0 <= i && i <= arr.length;
        //@ loop_invariant (\forall int j; 0 <= j && j < i; arr[j] == (\old(arr[j])+1));
        //@ loop_invariant (\forall int k; i <= k && k < arr.length; arr[k] == (\old(arr[k])));
        //@ decreases arr.length - i;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}