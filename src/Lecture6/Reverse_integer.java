package Lecture6;

public class Reverse_integer {
    public static void main(String[] args) {
        int n = 23597;
        int ans = 0;

        while(n>0){
            ans = ans * 10 + n%10;

            n = n/10;
        }
        System.out.println(ans);
    }
}
