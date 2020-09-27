import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Students : ");
        int students = in.nextInt();
        System.out.printf("Teachers : ");
        int teachers = in.nextInt();
        System.out.printf("Capacity : ");
        int capacity = in.nextInt();
        int busesRequired = (students + teachers) / capacity;
        int overflow = students + teachers - busesRequired * capacity;
        try {
            int temp = overflow/overflow;
            System.out.printf("%nBuses required      : %d", busesRequired + 1);
        }
        catch (Exception e) {
            System.out.printf("%nBuses required      : %d", busesRequired);
        }
        finally {
            System.out.printf("%nOverflow passengers : %d", overflow);
        }
    }
}