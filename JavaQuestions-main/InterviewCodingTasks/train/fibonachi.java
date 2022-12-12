package train;

public class fibonachi {

    public static void main(String[] args) {
Fibonach(20);
    }

    public static int Fibonach(int num){
        int next=0;
        int a=0;
        int b=1;

        for (int i =1 ; i< num; i++){
            next = a +b;
            a=b;
            b=next;
            System.out.println(next);
        }
        return next;
    }







}
