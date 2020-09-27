import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Height : ");
        double height = in.nextDouble();
        System.out.printf("Width  : ");
        double width = in.nextDouble();
        double Area = height * width*25.4*25.4;
        DecimalFormat formatter = new DecimalFormat("#.##");
        formatter.setGroupingUsed(true);
        formatter.setGroupingSize(3);
        System.out.printf("\n%s square millimeters.", formatter.format(Area));
    }
}