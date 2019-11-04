package com.company;

public class Main {

    public static void main(String[] args) {

	    StringBuffer originalNumber;

        // max value - 0b1111111111111111111111111111111
	    for(int i = -0b11111111;
            i < 0b11111111; i++){
            originalNumber = new StringBuffer(Integer.toBinaryString(i));
            if(originalNumber.toString().equals(originalNumber.reverse().toString())){
                System.out.println(originalNumber + " " + i);
            }
        }

    }
}
