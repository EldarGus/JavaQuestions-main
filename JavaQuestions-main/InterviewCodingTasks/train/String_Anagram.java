package train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class String_Anagram {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , manipulation.Solution 1:
                same("abc", "abb"); -> false:

     */

    //Sol 1
    public static void anagram(String act,String exp){
        String actRes=act;
        for (int i = 0; i < act.length(); i++) {
            if(exp.contains(""+ act.charAt(i))){
                actRes=actRes.replace((""+ act.charAt(i)), "");

            }
        }
        if (actRes.isEmpty()){
            System.out.println("String is anagram");
        }else {
            System.out.println("String is not anagram");
        }

    }
    //Sol 2
    public static boolean anagram2 (String act,String exp){
        char [] actAr = act.toCharArray();
        char [] expAr = exp.toCharArray();

        Arrays.sort(actAr);
        Arrays.sort(expAr);

        String actRes = new String(actAr);
        String expRes = new String(expAr);
        return actRes.equals(expRes);
    }
    //Sol3
    public static boolean anagram3 (String act,String exp){
        act = new TreeSet<String>(Arrays.asList(act.split(""))).toString();
        exp = new TreeSet<String>(Arrays.asList(exp.split(""))).toString();

        return act.equals(exp);
    }




    public static void main(String[] args) {
        anagram("abssssc", "cab");
      //  System.out.println(anagram2("abc", "cab"));
        //System.out.println(anagram3("abc", "cab"));

    }



}
