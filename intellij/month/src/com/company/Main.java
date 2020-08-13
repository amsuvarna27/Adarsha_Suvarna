package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep","Oct", "Nov", "Dec"};
        Scanner s = new Scanner(System.in);
        try
        {
            int m = s.nextInt();
            System.out.println(months[m]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Out of bound");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Input mismatch");
        }
    }
}
