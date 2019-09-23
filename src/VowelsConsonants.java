import javax.print.DocFlavor;
import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {


        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        isVowel(sentence);
    }

    public static String isVowel(String sentence) {

        int vowels = 0;
        int consanants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                vowels += 1;
                System.out.println("Sentence contains vowels");
            } else {
                consanants += 1;
            }

        }
        return "";
    }
}
