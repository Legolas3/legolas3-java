package controlFlowStatements;

public class WhileDoWhileStatements {
    public static void main(String[] args) {
//        int count = 0;

        // --------while--------
//        while (count != 6){
//            System.out.println("count value is = " + count);
//            count++;
//        }
//        count = 1;
//        while (true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("count value is = " + count);
//            count++;
//        }


//     -------do while------
//        count= 1;
//        do {
//            System.out.println("count value is = " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//        } while (count !=6);

        int number = 4;
        int finishNumber = 20;
        int totalevenNumbers = 0;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        // count the total number of even numbers



//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//            totalevenNumbers++;
//            if (totalevenNumbers >= 5) {
//                break;
//            }
//
//        }
//
//        System.out.println("Total even numbers found = " + totalevenNumbers);
        System.out.println("Thw Sum of digits in number 125 is  " + sumDigits(13
        ));
    }

//Write a method with the name sumDigits that has one int parameter called number.
//
//If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//The numbers from 0-9 have 1 digit so we donÅft want to process them, also we donÅft want to process negative numbers, so also return -1 for negative numbers.
//
//For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
//
//Hint:
//	Use n % 10 to extract the least-significant digit.
//	Use n = n / 10 to discard the least-significant digit.
//	The method needs to be static like other methods so far in the course.
//
//Tip:
//	Create a project with the name DigitSumChallenge.

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
       int sum = 0;
        // 125 --> 125 / 10 = 12 --> 12 * 10 = 120 --> 125 - 120 = 5
        while (number > 0){
        // extract the least-significant digit
            int digit = number % 10;

            sum += digit;
        // drop the least-significant digit
        number /= 10; // same as number = number / 10
        }

        return sum;
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

