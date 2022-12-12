package manipulation;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */

   static public int[] sortingArrayAsc(int[] arr) {

      int[] result = Arrays.copyOfRange(arr, 0, arr.length);
       // int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }
    public static void main(String[] args) {

        int[] n = new int[]{1,2,3,0,16,0,8,9};
        sortingArrayAsc(n);
        System.out.println(Arrays.toString(sortingArrayAsc(n)));


    }

}
