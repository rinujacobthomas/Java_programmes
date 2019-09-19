package economy;

import java.util.Scanner;

public class Economy {
	public static void main(String [] args)
	{
	int i,count=0;
	double k=0;	
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of bowlers");	
	int number=s.nextInt();
	int runs[]=new int[number];
	int balls[]=new int[number];
	double economy[] = new double[number];
	System.out.println("Enter the runs conceded by the bowlers");
	for(i=0;i<number;i++)
	{
	runs[i]=s.nextInt();

	}
	System.out.println("Enter the number of balls for each bowler");
	for(i=0;i<number;i++)
	{
	balls[i]=s.nextInt();

	}
	System.out.println("Economy of the bowlers is");
	for(i=0;i<number;i++)
	{
		economy[i]=(double)(runs[i]/(balls[i]/6.0));
		System.out.println(economy[i]);
		k=k+economy[i];
		if(economy[i]<=6)
			count++;
		
	}
	System.out.println("The overall economy of the teanm is "+k/number);
	System.out.println("The number of bowlers eligible are "+count);
}
}
