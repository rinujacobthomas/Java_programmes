package amstrong;
import java.util.Scanner;
public class Main {
public static void main(String [] args)
{
	int number,count,temp,total=0;
	Scanner br = new Scanner(System.in);
	System.out.println("Enter a number");
number= br.nextInt();
temp=number;
for(count=0;temp!=0;count++)
{ 
temp=temp/10;	
}
temp=number;
while(temp!=0)
{
total=(int) (total+Math.pow(temp%10,count));
		
temp=temp/10;
}
if(number==total)
System.out.println("The given number is amstrong");
else
	System.out.println("The given number is not amstrong");
}
}
