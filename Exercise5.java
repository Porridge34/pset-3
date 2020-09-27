import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Homework 1 : ");
        double average = in.nextDouble() * .05;
        System.out.printf("Homework 2 : ");
        average += in.nextDouble() * .05;
        System.out.printf("Homework 3 : ");
        average += in.nextDouble() * .05;
        System.out.printf("Quiz 1     : ");
        average += in.nextDouble() * .175;
        System.out.printf("Quiz 2     : ");
        average += in.nextDouble() * .175;
        System.out.printf("Test 1     : ");
        average += in.nextDouble() * .5;
        System.out.printf("%n%.2f%%.", average);
    }
}