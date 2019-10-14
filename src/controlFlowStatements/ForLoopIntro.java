package controlFlowStatements;

public class ForLoopIntro {

    public static void main(String[] args) {
        System.out.println("10,000 dollars at 2% interest = " + calculatInterest(10000, 2)+ " dollars");

//        for(init, termination, increment)
        for(int i = 2; i <= 8; i++){
            System.out.println("10,000 dollars at " + i + "% interest = " + calculatInterest(10000, i)+ " dollars");
        }


        System.out.println("*************************");

               // for(init, termination, increment)
        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 dollars at " + i + "% interest = " + (calculatInterest(10000, i)+ " dollars"));
        }


        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3){
                    System.out.println("exiting for loop");
                    break;
                }
            }

        }


    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i =2; i <= n/2; i++){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }


    public static double calculatInterest(double amount, double interest){
        return (amount * (interest/100));
    }

}
