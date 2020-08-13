package com.company;
import java.util.Scanner;
class Main {
    public static void main(String [] args){
      System.out.println("Eneter your addresss");
      Scanner s = new Scanner(System.in);
      String address = s.nextLine();
      System.out.println("Your address is "+address);

    }
}