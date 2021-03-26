package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("TheNurseryAlice.txt");
        Scanner in = new Scanner(file);

        int words = 0;

        while(in.hasNextLine()) {
            String line = in.nextLine();
            words += line.split(" ").length;
        }
        // write your code here
        System.out.println(words);
    }
}
