package manipulation;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }
    public static void main(String[] args) {

        int[] n = new int[]{1,2,3,0,16,0,8,9};
     Array_MoveAllZerosToTheEnd student = new Array_MoveAllZerosToTheEnd();


        System.out.println(Arrays.toString(student.moveZerosToTheEnd(n)));
    }

}
