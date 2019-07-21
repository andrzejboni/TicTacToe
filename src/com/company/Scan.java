package com.company;


import java.util.Scanner;


public class Scan {

    public static Scanner scanner = new Scanner(System.in);


//    public int scanner() {
//        return scanner.nextInt();
//    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Scan.scanner = scanner;
    }
//
//    int a = scanner.nextInt();        // EXAMPLE

}
