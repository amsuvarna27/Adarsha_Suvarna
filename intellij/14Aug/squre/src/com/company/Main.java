package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner s = new Scanner((System.in));
        System.out.println("Enter the number ");
        n = s.nextInt();
        int sq = n*n;
        System.out.println("Square of "+ n +" is " + sq);
    }
}
