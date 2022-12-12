package train;

import java.util.Scanner;

public class multip {
    public static double multi(){
        Scanner s = new Scanner(System.in);
        double first=-1;
        do {
            System.out.println("Enter first number");
           first = s.nextDouble();
        }
        while (first<0 || first >=999999 );
        double second =-1;
        do {
            System.out.println("Enter second number");
            second = s.nextDouble();
        }
        while (second<0 || second >=999999 );

        double summ= first*second;
        return summ;
    }

    public static void main(String[] args) {

        System.out.println( "Your result is " + multi());



//        System.out.println("Enter");
//        double second =  s.nextDouble();
//        System.out.println(second);

    }


}
