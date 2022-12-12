package train;

public class FirstUniqChar {
    /*
    write a program that can return the first non-repeated character from a string
     */

    public static void FirsUniq (String str) {

        for (int j = 0; j < str.length(); j++) {
            int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (("" + str.charAt(j)).equals("" + str.charAt(i))) {
                count++;
            }
        }
            if (count==1){
                System.out.println((str.charAt(j)) + " Is uniq");
                 break;
            }
    }
    }
    public static void main(String[] args) {
        FirsUniq("AACBB");
    }


}
