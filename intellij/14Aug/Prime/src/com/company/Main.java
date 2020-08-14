package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i =0;
        int n =0;
        String  primeNumbers = "";
        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(n = i; n >= 1; n--)
            {
                if(i % n == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }
}