package asg1;

public class Asg1Part2 {
	public static void main(String[]args)
	{
		int sum= 0;
		for(int index=0; index<=100; index++)
		{
            sum +=index;
		}
		System.out.println("The sum of the numbers from 1 to 100 is: "+sum);
		
		int sum2= 0;
		for(int index=0; index<=2000; index++)
		{
			if(index%13==0) 
			{
				sum2 +=index;
			}
		}
		System.out.println("The sum of the numbers from 1 to 2000 and that are divisible by 13 is: "+ sum2);
		int sum3= 0;
		for(int index=0; index<=50; index++) 
		{
			int square= index*index;
			sum3+=square;
				
		}
		System.out.println("The Sum of the square numbers from 1 to 50 is: "+ sum3);
	}
}
