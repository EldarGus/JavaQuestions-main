import java.io.FilterOutputStream;
import java.util.Arrays;

public class testManip {





    static public void maxval ( int[] n){
        int max = Integer.MIN_VALUE;
        for(int each: n ){
            if(each>max){
                max =each;
            }
        }
        System.out.println(max);
    }

    public static void minVal(int[] n ){
        int min = Integer.MAX_VALUE;
        for(int each: n ){
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);
    }
public static int FirstDub(int[] n ){
        int Dub = 0;
        for(int each: n ){
            int freq=0;
           for(int each2: n ){
               if(each==each2){
                   freq++;
               }
               if(freq>
                       1){
                   Dub=each;
                   break;
               }
            }
        }
        return Dub;
    }

      static public int [] sortAsc (int[] arr){
        int [] n = Arrays.copyOfRange(arr, 0 ,arr.length);
        for(int i = 0; i< n.length; i++){

            for (int j =0; j<n.length; j++){
                if(n[i]<n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[i] = temp;
                }
            }
        }
        return n;
      }
    //    int[]

   // }



    public static void main(String[] args) {

        int[] n = new int[]{1,2,3,5,16,2,8,9};

        System.out.println(Arrays.toString(sortAsc(n)));


    }

}
