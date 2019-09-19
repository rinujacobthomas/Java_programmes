package Average;

import java.util.Scanner;

public class Average {
	public static void main(String [] args)
	{
	int i,k=0;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of students");	
	int number=s.nextInt();
	int mark[]=new int[number];
	number=number-1;
	System.out.println("Enter the marks of students");
	for(i=0;i<=number;i++)
	{
	mark[i]=s.nextInt();

	}
	for(i=0;i<=number;i++)
	{
		k=k+mark[i];
		
	}
	System.out.println("The average is "+k/number);
	
}
}
