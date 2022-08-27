package asg1;

import java.util.Scanner;

public class Asg1Part1 
{
	public static void main(String[]args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age= scanner.nextInt();
		scanner.nextLine();
		if(age>=18) 
		{
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
			}
		if(age>= 35) {
			System.out.println("You are eligible to be the president of the United States!");
		}
		else {
			System.out.println("You are not able to be president, yet!");
		}
		if (age>= 65) {
			System.out.println("You are eligible to receive Medicaid Benefits!");
		}
		else {
			System.out.println("You are not able to receive Medicaid Benefits");
		}
		if(age>=16 && age<= 25) {
			System.out.println("You are paying extra for car insurance");
		}
		else {
			System.out.println("You are not paying extra for car insurance");
		}
	System.out.println("Enter your GPA: ");
		double gpa= scanner.nextDouble();
		scanner.nextLine();
		if(gpa<0.0 || gpa>4.0) {
			System.out.println("Invalid GPA. GPA must be between 0.0 to 4.0.");
		}
		else
		{
			if(gpa>= 3.25) {
				System.out.println("GPA is eligible for the Dean's list!");
			}
			if(gpa<2.0) {
				System.out.println("Uh oh! You're GPA is causing a probationary status");
			}
			if(gpa>=2.5) {
				System.out.println("Your GPA is a least satisfactory");
			}
		}
		System.out.println("Enter your hometown: ");
		String homeTown= scanner.nextLine();
		System.out.println("Welcome your hometown is "+homeTown);
		String upperHomeTown="";
		upperHomeTown= homeTown.toUpperCase();
		System.out.println(upperHomeTown);
		int len=homeTown.length();
		System.out.println(len);
	}
}
//comment