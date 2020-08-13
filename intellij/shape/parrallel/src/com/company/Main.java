package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int j=1; j<=5; j++){
            for (int k=5; k>=j; k--){
                System.out.print(" ");
            }
            for (int i=1; i<=5; i++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
