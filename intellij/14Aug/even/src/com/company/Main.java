package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 100;
        System.out.println("Even num from 1 to " + n +" are ");
        for (int i=1; i<=n; i++){
            if (i%2==0){
                System.out.println(i + " ");
            }
        }
    }
}
