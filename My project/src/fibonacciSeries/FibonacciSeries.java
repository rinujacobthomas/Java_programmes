package fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String [] args)
	{
	int i,k=0;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of students");	
	int number=s.nextInt();
int a=0,b=1,c;
System.out.print("The fibonacci series is "+a+" "+b+" ");
for(i=0;i<=number;i++)
{
c=a+b;	
System.out.print(c+" ");
a=b;
b=c;
}

}
}
