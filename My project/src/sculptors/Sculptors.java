package sculptors;

import java.util.Scanner;

public class Sculptors {
	public static void main(String [] args)
	{
	int i,k=0;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the kgs of gold");	
	int number=s.nextInt();
	int total=number/5;
	System.out.println("Number of Sculptors can be made is "+(total+number));
}}
