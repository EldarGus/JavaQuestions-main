package manipulation;

import java.util.Arrays;

public class Array_Reverse {

    /*
    write a function that can reverse an array
     */


    public static int[] reverse(int[] arr){

       int[] result = new int[arr.length];
       // int[] result = Arrays.copyOfRange(arr, 0, arr.length);
        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }

        return result;
    }
    public static void main(String[] args) {

        int[] n = new int[]{1,2,3,0,16,0,8,9};

        System.out.println(Arrays.toString(reverse(n)));


    }



}
