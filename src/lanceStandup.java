import java.util.Scanner;

public class lanceStandup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // These exercises are from a udemy class

//        /////// If, else-if, and else blocks  ///////////////

//        System.out.println("Welcome to SuperFast Rollercoaster");
//        System.out.print("Please enter your height in inches:");
//        int height = sc.nextInt();
//
//        if(height < 60){
//            System.out.println("Sorry, you're too short");
//        } else if(height > 84) {
//            System.out.println("Sorry, you're too tall");
//        }
//
//        else {
//            System.out.println("Enjoy the ride");
//        }
        //////// Complex conditions with logical operators  /////////

//        if(height > 60 && height < 84) {
//            System.out.println("Enjoy the ride");
//        }else {
//            System.out.println("You do not meet the requirements");
//        }



//        Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.
//
//                If the player guesses right, print “Correct! Aren’t you lucky.“.
//
//        If the player guesses wrong, print “Hard luck! Maybe next time.“.
//
//        You can use the line of code below which produces a random number from 1 to 5 and stores it in a variable called randomNumber.
//
//        int min = 1;
//        int max = 5;
//        int range = max - min + 1;
//
//        int randomNumber = (int) (Math.random() * range + min);
//        System.out.println(randomNumber);
//
//        System.out.println("Guess a number between 1 and 5");
//        int guessedNumber = sc.nextInt();
//        if (guessedNumber == randomNumber) {
//            System.out.println(" Aren’t you lucky.");
//        } else {
//            System.out.println("Wrong, you have one more guess");
//            guessedNumber = sc.nextInt();
//            if (guessedNumber == randomNumber) {
//                System.out.println("Got it right the second time");
//            } else {
//                System.out.println("Wrong number, better luck next time");
//            }
//        }

        ////// Introduction to methods //////

        System.out.println(19);
        bar();
        foo();
        System.out.println(24);
    }

    public static void foo() {
        int x = 50;
        System.out.println(x);
        System.out.println(16);
    }
    public static  void bar(){
        foo();
        System.out.println("12");

        ////// Passing data to methods ////////

        int var = 5;


        foo(var, 57.5, " It's hard to connect with people");


    }
    public static void foo(int a, double b, String c){
        System.out.println(a + b + c);


    }

}
