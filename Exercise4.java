import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Height : ");
        double height = in.nextDouble();
        System.out.printf("Width  : ");
        double width = in.nextDouble();
        double perimeter = height * 2.54 * 2 + (width * 2.54 * 2);
        DecimalFormat formatter = new DecimalFormat("#.00");
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(3);
        System.out.printf("\n%s centimeters.", formatter.format(perimeter));
    }
}