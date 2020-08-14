package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i=0; i<=a.length-1; i++)
        {
            System.out.println("Enter Marks");
            a[i] = s.nextInt();
        }
        for (int i=0; i<=4; i++){
            System.out.print(a[i]);
        }
    }
}
