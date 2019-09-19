package heights;

import java.util.Scanner;

public class Height {
public static void main(String [] args)
{
	int i,k=1;
	
	Scanner s= new Scanner(System.in);
System.out.println("Enter the number of students");	
int number=s.nextInt();
double height[]=new double[number];
number=number-1;
System.out.println("Enter the heights of students");
for(i=0;i<=number;i++)
{
height[i]=s.nextDouble();

}
for(i=number;i>=0;i--)
{
for(int j=number;j>=k;j--)
{
	if(height[j]<height[j-1])
	{
		double temp=height[j-1];
		height[j-1]=height[j];
		height[j]=temp;
    }
}	
k++;
}
System.out.println("The heights in order are");
for(i=0;i<=number;i++)
{
System.out.println(height[i]);	
}
}
}
