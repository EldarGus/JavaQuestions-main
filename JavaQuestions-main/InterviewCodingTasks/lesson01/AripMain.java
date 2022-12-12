package lesson01;

public class AripMain {
    public static void main(String[] args) {
        //int x = 2/0;
        Student h1 = null;
        //h1.name = "gg";
        String str = null;
        //str.length();
        //throw new UnsupportedOperationException();

        doSomething();


        try {
            doSomething2();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("blablabla");
        }
        System.out.println("ggg");



    }

    public static void doSomething(){
        try {
            throw  new Exception();
            //System.out.println("ff");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSomething2() throws Exception {

        throw  new Exception();

    }
}
