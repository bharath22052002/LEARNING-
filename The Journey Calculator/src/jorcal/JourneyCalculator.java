package jorcal;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and time to calculate the distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		CalculatorObject calculatorobject=new CalculatorObject();
		double distance=calculateDistance(speed,time);
		System.out.println(distance);
		
	}
	public class CalculatorObject
	{
	public double calculateDistance(double speed,double time)
	{
	return speed*time;	
	}
	}
}

