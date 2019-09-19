package ncr;

import java.util.Scanner;

public class Ncr {
	public static void main(String [] args)
	{
int i;
long nsum=1,rsum=1,nrsum=1;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the value of n");	
	int n=s.nextInt();
	System.out.println("Enter the value of r");	
	int r=s.nextInt();
	for(i=1;i<=n;i++)
	{
	nsum=nsum*i;
	}
	for(i=1;i<=r;i++)
	{
	rsum=rsum*i;
	}
	for(i=1;i<=(n-r);i++)
	{
	nrsum=nrsum*i;
	}
	System.out.println("The NCR factor for given values is "+nsum/(rsum*nrsum));
}}
