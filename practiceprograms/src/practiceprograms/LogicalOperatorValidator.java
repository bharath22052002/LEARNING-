package practiceprograms;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        boolean a=scan.nextBoolean();
        boolean b=scan.nextBoolean();
        boolean res=itValidInput(a,b);
        scan.close();
        System.out.println("Is input is valid:"+a);
        System.out.println("Does input meet a certain condition (true/false):"+b);
        if(res==true)
        {
        
        	System.out.println("Input is valid");
        }
        else
        
        	System.out.println("input is invalid");
	}
    public static boolean itValidInput(boolean a,boolean b)
    {
    	return a||b;
    		
    	}
    	
}
    
  


