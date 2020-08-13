package com.company;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File f = new File("a.txt");
        Scanner s = new Scanner(f);
        int words = 0;
        while (s.hasNextLine())
        {
            String line = s.nextLine();
            words += line.split("").length;
        }
        System.out.println("The number of words in the file is " + words + " .");
    }
}
