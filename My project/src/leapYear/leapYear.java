package leapYear;

import java.util.Scanner;

public class leapYear {
	public static void main(String [] args)
	{
	int i,k=0;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter a year");	
	int year=s.nextInt();
	if(year%4==0)
		System.out.println("It is a leap year");
	else if((year%100==0)&&(year%400==0))
		System.out.println("It is a leap year");
	else
		System.out.println("It is not a leap year");
	
	
}
}
