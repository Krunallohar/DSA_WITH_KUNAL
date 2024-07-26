package Lecture6;

import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;

       while(n>0){
           if(n % 10 ==3){
              count++;
           }
           n=n/10;
       }
        System.out.println(count);
    }
}
