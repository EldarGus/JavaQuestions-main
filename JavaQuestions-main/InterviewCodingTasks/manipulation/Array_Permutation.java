package manipulation;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Permutation {

   /*
    Given an array of 3 characters print all permutation combinations from the given characters
    */

    public void printPermutation(char[] ch) {
        for (String s : permutation(ch)) {
            System.out.println(Arrays.toString(s.toCharArray()));
        }
    }

    static public Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "")
                .replace("]", "");
        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }

        }

        return set;
    }
    public static void main(String[] args) {

        int[] n = new int[]{1,2,3,0,16,0,8,9};
       char[] p = new char[]{};

        permutation(p);

        System.out.println(Arrays.toString(p));
    }
}
