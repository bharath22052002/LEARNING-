package practiceprograms;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
        int number=scan.nextInt();
        scan.close();
     
	switch(number) { 
	case 1:
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+b);
		break;
	}
	case 2:
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a-b);
		break;
	}
	case 3:
	{
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a*b);
		break;
	}
	default:
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a/b);
	}
  }
 }


	