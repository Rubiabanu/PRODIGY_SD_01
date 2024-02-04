import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        double temperature = scanner.nextDouble();
        System.out.println("Enter temperature unit (C, F, or K):");
        String unit = scanner.next().toUpperCase();

        if (unit.equals("C")) {
            System.out.printf("Converted values:%n%.2f degrees Fahrenheit%n%.2f Kelvin%n", celsiusToFahrenheit(temperature), celsiusToKelvin(temperature));
        } else if (unit.equals("F")) {
            System.out.printf("Converted values:%n%.2f degrees Celsius%n%.2f Kelvin%n", fahrenheitToCelsius(temperature), fahrenheitToKelvin(temperature));
        } else if (unit.equals("K")) {
            System.out.printf("Converted values:%n%.2f degrees Celsius%n%.2f degrees Fahrenheit%n", kelvinToCelsius(temperature), kelvinToFahrenheit(temperature));
        } else {
            System.out.println("Invalid unit");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }
}