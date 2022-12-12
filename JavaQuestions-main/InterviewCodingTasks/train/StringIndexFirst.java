package train;

public class StringIndexFirst {
    /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */


    public static int IndexNonRepeat(String str){
        int result=-1;
        for (int i = 0; i < str.length(); i++) {

            int count=-1;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
               result+=count+i+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //IndexNonRepeat("AAACDDD");
       System.out.println(IndexNonRepeat("AAVCCBBDDD"));

    }
}
