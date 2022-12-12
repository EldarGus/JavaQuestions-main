package train;

public class Char_ASCHII {
    public static void main(String[] args) {

        char a = 'a';
          String b = String.valueOf(a);



          if(b.matches(".*[A-z].*") ){
              System.out.println(a + "  is lower case letter");
          }else{
              System.out.println("Wrong symbol");
          }

    }
}
