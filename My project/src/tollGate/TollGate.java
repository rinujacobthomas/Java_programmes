package tollGate;

import java.util.Scanner;

public class TollGate {
	public static void main(String [] args)
	{
	int i,count=0,b=0;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of vehicles");	
	int number=s.nextInt();
	int vehicle[]=new int[number];
	System.out.println("Enter the fare collected for each vehicles");
	for(i=0;i<number;i++)
	{
	vehicle[i]=s.nextInt();

	}
	for(i=0;i<number;i++)
	{
	if(vehicle[i]>50)
		count++;
	else if((vehicle[i]<50)&&(vehicle[i]!=0))
		b++;
	}
	System.out.println("Number of heavy vehicles "+count+" and the number of light weight vehicles is "+b);
	
}
}
