package jumbledLetters;

import java.util.Scanner;

public class JumbledLetters {

	public static void main(String [] args)
	{	
		int i,sum=1;
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number alphabets in your name");	
	int number=s.nextInt();
	for(i=number;i>0;i--)
	{
		sum=sum*i;
	}
	System.out.println("The number of combination is "+sum);
	
	
	
	
	}
	
}
