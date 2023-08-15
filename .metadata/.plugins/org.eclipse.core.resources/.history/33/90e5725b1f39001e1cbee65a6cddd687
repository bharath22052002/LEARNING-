package practiceprograms;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the purchase amount:");
    double purchaseAmount=scan.nextDouble();
    System.out.print("Enter the tax rate (in decimal form:");
    double taxRate=scan.nextDouble();
    System.out.print("Total cost including tax:"+calculateTotalWithTax(purchaseAmount,taxRate));
    scan.close();
	}
	
	public static double calculateTotalWithTax(double purchaseamount,double taxrate)
	{
	return purchaseamount*taxrate;	
	}
}
