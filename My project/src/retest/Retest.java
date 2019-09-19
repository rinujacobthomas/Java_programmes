package retest;

import java.util.Scanner;

public class Retest {
	public static void main(String [] args)
	{
	int i,k,count=0;
		
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
	k=mark[0];
	for(i=1;i<=number;i++)
	{
		if(k<mark[i])
			k=mark[i];	
	}
	k=k/2;
	for(i=0;i<=number;i++)
	{
		if(k>mark[i])
		count++;	
	}
	System.out.println("Number of students appearing for retest is "+count);
	
}
}
