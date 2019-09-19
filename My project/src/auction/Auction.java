package auction;

import java.util.Scanner;

public class Auction {
	public static void main(String [] args)
	{
	int i,k;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of applications");	
	int number=s.nextInt();
	int amount[]=new int[number];
	number=number-1;
	System.out.println("Enter the amount(in crores)");
	for(i=0;i<=number;i++)
	{
	amount[i]=s.nextInt();

	}
	k=amount[0];
	for(i=1;i<=number;i++)
	{
		if(k<amount[i])
			k=amount[i];	
	}
	System.out.println("The winning bid is "+k+" crores");
	
	
	
	
	
}
}
