package resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String [] args) throws IOException
{
String name;
String age;
String degree;
String branch;
String contactNumber;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your Name");
name=br.readLine();
System.out.println("Enter your age");
age=br.readLine();
System.out.println("Enter your Degree");
degree=br.readLine();
System.out.println("Enter your Branch");
branch=br.readLine();
System.out.println("Enter your Contact Number");
contactNumber=br.readLine();
System.out.println("OUTPUT");
System.out.println("\n");
System.out.println("Name    : "+name+"\nAge     : "+age+"\nDegree  : "+degree+"\nBranch  : "+branch+"\nContact : "+contactNumber);
}

}
