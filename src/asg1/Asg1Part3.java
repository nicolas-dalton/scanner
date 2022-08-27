package asg1;

import java.util.Scanner;

public class Asg1Part3 {
public static boolean isOdd(int number)
{
	if(number%2==0) 
	{
		return false;
	}
	else {
		return true;
	}
}
public static void main(String[]args)
{
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number= scanner.nextInt();
	scanner.nextLine();
	boolean result= isOdd(number);
	if(result==true) {
		System.out.println("ODD");
	}
	else {
		System.out.println("EVEN");
	}
	System.out.println("Enter a number(double type): ");
	double aValue= scanner.nextDouble();
	scanner.hasNextLine();
	String value= getCategory(aValue);
	System.out.println(value);
}
public static String getCategory(double aValue) 
{
	if(aValue>100.0) 
	{
		String aString= "Over";
		return aString;
	}
	if(aValue<=100.0 && aValue>=25.0) 
	{
		String aString="Average";
		return aString;
	}
	else 
	{
		String aString= "Below";
		return aString;
	}
		
}
}