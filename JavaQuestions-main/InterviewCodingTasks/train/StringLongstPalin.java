package train;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class StringLongstPalin {

    /*
    Write a program that can return the longest palindrome from a string
     */
     public static void LongPalind(String str){
         ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str.split(" ")));

         for (String each: arr) {
             int z = 1;
             int isPalind = 0;

             for (int i = 0; i < each.length(); i++) {

                 if (each.charAt(i) == each.charAt(each.length() - z)) {
                     isPalind++;
                 }
                 z++;

             }
             if (isPalind != each.length()) {
                 arr.remove(each);

             }
             }
         String longest ="No Longest palindrome";

              for (int i = 0; i < arr.size(); i++) {
                 for (int j = 0; j < arr.size(); j++){

                     if(arr.get(i).length()>  arr.get(j).length()){
                         longest=arr.get(i)+ " Is longest palindrome";
                     }
                 }
             }
         System.out.println(longest);


     }
    public static void main(String[] args) {
        LongPalind("radar racecar madam bbaaaaaaaaaabb");
    }
}
