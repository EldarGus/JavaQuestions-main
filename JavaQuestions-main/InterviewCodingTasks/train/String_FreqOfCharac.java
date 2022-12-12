package train;

public class String_FreqOfCharac {

      /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void FreqOfChar(String str){
        String result="";
           int i=0;
           while( i < str.length()) {
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result += str.charAt(i) +""+ count;
            str = str.replace(""+str.charAt(i), "");
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        FreqOfChar("AAABBCDD");
        //System.out.println(frequencyOfChars1("AAABBCDD"));

    }
}
