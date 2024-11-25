import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check whether it is vowel or consonant:");
        String str = sc.next();

        str = str.toLowerCase();

        if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
            System.out.println("It's a vowel.");
        } else {
            System.out.println("It's a consonant.");
        }
    }
}

