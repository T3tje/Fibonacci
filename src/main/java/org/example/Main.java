package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonaccifolge");
        }
    //fibonacci

    public static int fibonacci(int n) {
        if (n<=1) {
            return n;
        }
        int vorher = 0;
        int aktuell = 1;

        for (int i = 2; i <= n; i++) {
            int next = aktuell + vorher;
            vorher = aktuell;
            aktuell = next;
        }
        return aktuell;
    }
}