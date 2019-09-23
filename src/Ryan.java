import java.util.Scanner;

public class Ryan {
    public static void main(String[] args) {

//        System.out.println(formatDate("01/18/1991"));

        int i = 1;

        System.out.println(fizzBuzzLoopRefactor(i));


        //A PIG LATIN TRANSLATOR

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Give me a sentence and I'll translate it to Pig Latin");
//
//        String userInput = sc.nextLine();
//
//        String[] arrOfString = userInput.split(" ");
//
//
//        for(String var: arrOfString) {
//
//            //COPIES FIRST LETTER OF STRING AND STORES IT
//
//            String firstLetter = var.substring(0, 1);
//
//            //COPIES EVERYTHING IN STRING BEGINNING SECOND LETTER
//
//            String wordMinusFirstLetter = var.substring(1, var.length());
//
//            //MAKES THE WORD INTO PIG LATIN
//
//            String pigLatinString = wordMinusFirstLetter + firstLetter + "ay ";
//
////            System.out.println(pigLatinString);
//            //-----------------------------------------------------------------------------
//
//            //CHECK TO SEE IF WORDS HAVE PUNCTUATION
//
//            //TURN TRANSLATED STRING BACK INTO ARRAY
//
//            String[] pigLatinArray = pigLatinString.split(" ");
//
//            for(String nextVar: pigLatinArray) {
//
//                //Loop that checks each word and see if it has punctuation and then removes it
//
//                System.out.print(nextVar + " ");
//
//                if(nextVar.indexOf("?") >= 1) {
//                    //Take out that character and place it at the end
//
//
//
//
//                } //if
//
//
//            } //for()
//
//        }// for() outer

    } //main()

    //FUNCTION THAT FORMATS A DATE

    public static String formatDate(String date) {

        String day = date.substring(3, 5);

        String year = date.substring(6);

        String month = date.substring(0, 2);

        if(month.equals("01")) {
            month = "January";
        } else if(month.equals("02")) {
            month = "February";
        } else if(month.equals("03")) {
            month = "March";
        } else if(month.equals("04")) {
            month = "April";
        } else if(month.equals("05")) {
            month = "May";
        } else if(month.equals("06")) {
            month = "June";
        } else if(month.equals("07")) {
            month = "July";
        } else if(month.equals("08")) {
            month = "August";
        } else if(month.equals("09")) {
            month = "September";
        } else if(month.equals("10")) {
            month = "October";
        } else if(month.equals("11")) {
            month = "November";
        } else if(month.equals("12")) {
            month = "December";
        }

        return month + " " + day + "," + year;
    }

    //HACKER RANK PROBLEMS - NEED TO REFACTOR IN ORDER TO WORK WITH THIS REPO

//    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//
//        int aliceComparisonPoints = 0;
//        int bobComparisionPoints = 0;
//        if(List[0] a > List[0] b) {
//            aliceComparisonPoints++;
//        } else if(a[0] < b[0]) {
//            bobComparisonPoints++;
//        } else if(a[0] == a[0]) {
//            continue;
//        }
//
//    }

//    static int simpleArraySum(int[] ar) {
//        int ar_sum = 0;
//        for(int i=0; i<ar.length; i++) {
//            ar_sum += ar[i];
//        }
//        return ar_sum;
//    }


    //REFACTOR USING RECURSION

//    public static void fizzBuzzLoop() {
//        int i = 1;
//        while (true) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            if (i == 100) {
//                break;
//            }
//            i++;
//        }
//    }

    public static int fizzBuzzLoopRefactor(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }

        i++;

        if(i <= 100) {
            fizzBuzzLoopRefactor(i);
        }

        return i;
    }

}
