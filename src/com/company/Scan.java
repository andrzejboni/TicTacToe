package com.company;


import java.util.Scanner;


public class Scan {

    public static Scanner scanner = new Scanner(System.in);


    public static int getScanner() {
        return scanner.nextInt();
    }


    public static void setScanner(Scanner scanner) {
        Scan.scanner = scanner;
    }

}
