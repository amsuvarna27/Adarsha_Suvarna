package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your grade ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("you did well");
        }else
            {
            System.out.println("better next time");
        }
    }
}
