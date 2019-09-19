package fouls;

import java.util.Scanner;

public class Fouls {
	public static void main(String [] args)
	{
	int i,k,count=1;
		
		Scanner s= new Scanner(System.in);
	System.out.println("Enter the number of players");	
	int number=s.nextInt();
	int players[]=new int[number];
	number=number-1;
	System.out.println("Enter the number of fouls made by each player");
	for(i=0;i<=number;i++)
	{
	players[i]=s.nextInt();

	}
	k=players[0];
	for(i=1;i<=number;i++)
	{
		if(k>players[i])
			k=players[i];	
	}
	for(i=1;i<=number;i++)
	{
		if(k==players[i])
			count=i+1;
	}
	System.out.println("The eligible player is player no:"+count+"("+k+")");
	
	
	
	
	
}
	
	
	
	
	
}
