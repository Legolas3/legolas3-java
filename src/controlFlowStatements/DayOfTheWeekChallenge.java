package controlFlowStatements;

import java.time.DayOfWeek;
import java.util.Scanner;


public class DayOfTheWeekChallenge {




    public static void main(String[] args) { ;
printDayOfTheWeek(0);


    }

    private static void printDayOfTheWeek (int day){
        switch (day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.print("Invalid day");
        }

    }
}
