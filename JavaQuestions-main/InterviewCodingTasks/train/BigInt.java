package train;

import java.util.ArrayList;

public class BigInt {


        ArrayList<Integer> myNumber = new ArrayList <Integer>();

public BigInt(String number){

    for(int i =0 ; i <number.length(); i++){
        myNumber.add(number.indexOf(i));
    }
}

    @Override
    public String toString() {
        return "BigInt{" +
                "myNumber=" + myNumber +
                '}';
    }

    public static void main(String[] args) {
        BigInt myNumber =new BigInt("666666666666666666666");

        System.out.println();
    }
}

