package Project1;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
	System.out.println("Enter the numbers");
	Scanner scan=new Scanner(System.in);
	long num1=scan.nextLong();
	long num2=scan.nextLong();
	System.out.println (galacticAddition(num1,num2));
	scan.close();    
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
