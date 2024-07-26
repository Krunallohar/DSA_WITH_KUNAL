package Lecture6;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String ch = sc.next();
       // System.out.println(sc.nextLine());

        char ch = sc.next().trim().charAt(0);

        if (ch<='z' && ch>='a'){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("UpperCase");
        }
        //System.out.println(ch);
    }
}
