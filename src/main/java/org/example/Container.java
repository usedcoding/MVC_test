package org.example;

import java.util.Scanner;

public class Container {
    private static Scanner sc;

    public static void init() {
        new Scanner(System.in);
    }

    public static void close() {
        sc.close();
    }

    public static Scanner getScanner() {
        return sc;
    }
 }
