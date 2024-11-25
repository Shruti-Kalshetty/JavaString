import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        int x,y;
        double dis;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point");
        x=sc.nextInt();
        System.out.println("enter y1 point");
        y=sc.nextInt();
        double distance = Math.pow((x*x+y*y),0.5);
        System.out.println(distance);
    }
}