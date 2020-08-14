package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 1;
        printNumber(n);

    }
    public static void printNumber(int num)
    {
        if(num<=100){
            System.out.println(num + " ");
            printNumber(num + 1);
        }
    }
}
