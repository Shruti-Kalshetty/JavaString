import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Math.random();
        System.out.println("how many times you want to flip coin ");
        int turns = sc.nextInt();
        int heads = 0;
        int tails=0;
        for (int i=1;i<=turns;i++)
        {
            if (Math.random() < 0.5) {
                heads ++;
            } else {
                tails++;
            }
        }
            System.out.println("You got heads " +heads +" times");
            System.out.println("You got " +tails + " times");
        }
}