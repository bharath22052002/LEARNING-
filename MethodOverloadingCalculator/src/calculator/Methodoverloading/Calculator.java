package calculator.Methodoverloading;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the operator(+,-,*,/):");
		char operator=scan.next().charAt(0);
		switch(operator) {
	    case '+':
	    
		System.out.println("Enter the first number");
		byte a=scan.nextByte();
		System.out.println("Enter the second number");
		byte b=scan.nextByte();
		System.out.println("Result:"+calculate(a,b));
	    case '-':
	    	short val1=scan.nextShort();
		    short val2=scan.nextShort();
	    	System.out.println("Result:"+calculate(val1,val2));
		
	    case '*':
	    	int mul1=scan.nextInt();
		    int mul2=scan.nextInt();
	    	System.out.println("Result:"+calculate(mul1,mul2));
	    case '/':
	    long d1=scan.nextLong();
	    long d2=scan.nextLong();
	    System.out.println("Result:"+calculate(d1,d2));
	    scan.close();
	    }
		}
	public static byte calculate(byte num1,byte num2)
	{
		int c=num1+num2;
		byte l;
		l=(byte)c;
		return l;
		
		
	}
	public static int calculate(short sub1,short sub2)
	{
		return sub1-sub2;
	}
	public static int calculate(int mul1,int mul2)
	{
		return mul1*mul2;
	}
	public static long calculate(long div1,long div2)
	{
		return div1/div2;
	}

}
