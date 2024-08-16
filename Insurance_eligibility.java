package src;
import java.util.Scanner;
public class Insurance_eligibility {

	public static void main(String[] args) {
	 	Scanner in = new Scanner(System.in);
	 	System.out.println("Enter the Marital ststus M/U :");
	 	char marital = in.next().charAt(0);
	if(marital =='u'|| marital == 'U') 
	{
		System.out.println("enter the gender m/f:");
		char gender = in.next().charAt(0);
		System.out.println("enter your age:");
	     int age=in.nextInt();
	if((gender=='M' || gender =='m')&& age>=30)
	{
		System.out.println("You are eligible for insurance ");
	}
	else if ((gender=='F' || gender=='f')&& age >=25)
	{
		System.out.println("enter the gender m/f");
	}
	else 
	{
		System.out.println("you are not eligible for insurance");
	}
	}
	else if(marital=='m' || marital=='M')
	{
		System.out.println("you are eligible for insurance");
	}
	else 
	{
		System.out.println("Invalid input");
	
	
	}
	
}
}
