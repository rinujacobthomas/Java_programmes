package Priority;

import java.util.Scanner;

public class Student {
public static void main(String [] args)
{
int i,k=1;
	
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
for(i=number;i>=0;i--)
{
for(int j=number;j>=k;j--)
{
	if(mark[j]>mark[j-1])
	{
		int temp=mark[j-1];
		mark[j-1]=mark[j];
		mark[j]=temp;
    }
}	
k++;
}
System.out.println("The priority of marks is");
for(i=0;i<=number;i++)
{
System.out.println(mark[i]);	
}


}
}
