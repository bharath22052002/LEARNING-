package problem4;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Word");
		String str1=scan.next();
		String str2=scan.next();
		StringJoiner sj=new StringJoiner();
		//sj.joinString(str1,str2);
		System.out.println(sj.joinString(str1,str2));
		scan.close();
	}
	public  String joinString(String str1,String str2)
	{
		return str1+" "+str2;
	}

}
