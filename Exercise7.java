import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Salary  : ");
        double salary = in.nextDouble();
        System.out.printf("401(k)  : ");
        double totalAfter4k = salary - salary * in.nextDouble() / 100;
        System.out.printf("Federal : ");
        double total = totalAfter4k - totalAfter4k * in.nextDouble() / 100;
        System.out.printf("State   : ");
        total -= in.nextDouble() * totalAfter4k / 100;
        total /= 24;
        DecimalFormat formatter = new DecimalFormat("#.00");
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(3);
        System.out.printf("%n$%s.", formatter.format(total));
    }
}