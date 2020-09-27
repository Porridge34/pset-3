import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Fahrenheit : ");
        double fahrenheit = in.nextDouble();
        double celcius = (fahrenheit - 32) * ((double) 5/ (double) 9);
        double kelvin = celcius + 273.15;
        System.out.printf("%nCelsius : %.2f", celcius);
        System.out.printf("%nKelvin  : %.2f", kelvin);
    }
}