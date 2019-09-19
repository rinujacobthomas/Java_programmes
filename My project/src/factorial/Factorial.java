package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args)
	{	
		int i,sum=0,number;
		Scanner s= new Scanner(System.in);
		do
		{
	System.out.println("Enter a number");	
	number=s.nextInt();
		}
		while(number<0);
	for(i=number;i>0;i--)
	{
		sum=sum+i;
	}
	System.out.println("The sum is "+sum);
	
	
	
	
	}
}
