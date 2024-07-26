package Lecture_07;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int EmpID = sc.nextInt();
        String Department = sc.next();

        switch (EmpID) {
            case 1:
                System.out.println("Krunal");
                break;
            case 2:
                System.out.println("jassi");
                break;
            case 3:
                System.out.println("Im emplyee 3");
                switch(Department){
                    case "IT":
                        System.out.println("IT DEPARMENT");
                        break;
                    case "CS" :
                        System.out.println("computer science");
                        break;
                    default:
                        System.out.println("Enter valid deparment");

                } break;
            default:
                System.out.println("Enter valid EmpID");
                break;

        }
    }
}
