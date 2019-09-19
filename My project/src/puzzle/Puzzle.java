package puzzle;

import java.util.Scanner;

public class Puzzle {
	public static void main(String [] args)
	{
	int i,m=0;
		Scanner s= new Scanner(System.in);
	System.out.println("Enter a number");	
	int n=s.nextInt();
	System.out.print("The divisors of the number are "); 
	for(i=1;i<=n/2;i++)
	{
	if(n%i==0)
	{
		System.out.print(i+" ");
		m=m+i;
	}}
	System.out.println();
	if(m==n)
	System.out.println("It is a perfect number");
	else
		System.out.println("It is not a perfect number");
	}}
