package problem5;

import java.util.Scanner;

public class TemperatureConvertorApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the value of Fahrenheit to covvert the temperature into celsius");
    double fahrenheit=scan.nextDouble();
    TemperatureConverter temperatureConverter=new TemperatureConverter();
    System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
    scan.close();
	}

}
