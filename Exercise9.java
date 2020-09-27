import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Amount : ");
        double amount = in.nextDouble() * 100;
        int quarters = (int) amount / 25;
        amount -= quarters * 25;
        int dimes = (int) amount / 10;
        amount -= dimes * 10;
        int nickels = (int) amount / 5;
        amount -= nickels * 5;
        System.out.printf("%nQuarters : %d", quarters);
        System.out.printf("%nDimes    : %d", dimes);
        System.out.printf("%nNickels  : %d", nickels);
        System.out.printf("%nPennies  : %d", (int) amount);
    }
}