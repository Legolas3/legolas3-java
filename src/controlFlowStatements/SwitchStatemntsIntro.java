package controlFlowStatements;

import java.util.Scanner;
import java.util.*;

public class SwitchStatemntsIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println("enter a number between 1 and 5");
//        int swtichValue = sc.nextInt();
//
//
//
//        switch (swtichValue) {
//            case 1:
//                System.out.printf("value was 1");
//                break;
//
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3:
//                System.out.println("value was 3");
//                break;
//            case 4:
//                System.out.println("value was 4");
//                break;
//            case 5:
//                System.out.println("value was 5");
//                break;
//
//            default:
//                System.out.printf("number was not between 1 and 5");
//                break;
//    }

        System.out.println("Enter the letter a, b, or c");
        char letterInput = sc.next().charAt(0);
        switch (letterInput) {
            case 'A':
                System.out.println("Case A was found");
                break;
            case 'B':
                System.out.println("Case B was found");
                break;
            case 'C':
                System.out.print("Case C was found");
                break;

            default:

                System.out.println("letters a, b, or c was not entered");
        }
    }
}
