import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Wage      : ");
        double wage = in.nextDouble();
        System.out.printf("Monday    : ");
        double pay = in.nextDouble() * wage;
        System.out.printf("Tuesday   : ");
        pay += in.nextDouble() * wage;
        System.out.printf("Wednesday : ");
        pay += in.nextDouble() * wage;
        System.out.printf("Thursday  : ");
        pay += in.nextDouble() * wage;
        System.out.printf("Friday    : ");
        pay += in.nextDouble() * wage;
        System.out.printf("Saturday  : ");
        pay += in.nextDouble() * wage;
        System.out.printf("Sunday    : ");
        pay += in.nextDouble() * wage;
        System.out.printf("%n$%.2f.", pay);
    }
}