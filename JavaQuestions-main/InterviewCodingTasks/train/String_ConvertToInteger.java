package train;

public class String_ConvertToInteger {
    /*
    write a program that can convert a string to integer. DO NOT use parse or valueOf methods
     */
    public static void StringToInteger(String conv){
        Integer result=0;
        Integer factorTo10=1;
        for (int i = conv.length()-1; i >= 0; i--) {
            char each = conv.charAt(i);
            result += (each -'0') * factorTo10;
            factorTo10 *= 10;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        StringToInteger("999998");
    }


}
