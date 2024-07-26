package Lecture6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n ; i++) {
           int temp;
           temp = b;
            b = b + a;
            a= temp;
        }
        System.out.println(b);
    }
}
