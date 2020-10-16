/*
Lab Assignment - 2
ID:      U1910060
Name:    Alimov Abdullokh
Section: 002
*/
import java.util.Scanner;
public class BMIu1910060
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in); //Object for Scanner
        double height, weight;
		boolean option = true;
		int menu; 
		float BMI;
		int repitation;
         
		while(option) // Loop for Menu
		{
			System.out.println(" -- Menu -- ");
		    System.out.println("1. Calculate in (kg and meters)");
            System.out.println("2. Calculate in (ib and inches)");
			System.out.print("Enter Choice: ");
			menu = (input.nextInt()); // menu choice to use switch cases
			switch(menu)
			{
				case 1: // Case for calculating BMI in (kg and m) 
				{	
					System.out.print("Height (meters): ");
					height = (input.nextDouble()); // getting height from user 
					while (height <= 0){ // Validation for height
						System.out.print("Height (meters): ");
						height = (input.nextDouble()); // getting height again from user
					}
					
					System.out.print("Weight (kg): ");
					weight = input.nextDouble(); // getting weight from user
					while (weight <= 0){ // Validation for weight
						System.out.print("Weight (kg): ");
						weight = input.nextDouble(); // getting weight again from user
 					}
					
					BMI = (float) (weight/(height*height)); // calculatin BMI and making it 
					
					System.out.println("----------------------");

					/* Conditions to print BMI with its description */
					if (BMI < 18.5){
						System.out.printf("BMI is %.2f Underweight", BMI);
					}
					else if (BMI >= 18.5 && BMI<=24.9){
						System.out.printf("BMI is %.2f Normal ", BMI);
					}
					else if (BMI >= 25 && BMI<=29.9){
						System.out.printf("BMI is %.2f Overweight", BMI);
					}
					else if (BMI >= 30 && BMI<=34.9){
						System.out.printf("BMI is %.2f Obese", BMI);
					}
					else {
						System.out.printf("BMI is %.2f Extremely Obese", BMI);
					}        
					
					// Condition for calculation repitation
					System.out.println("");
					System.out.println("----------------------");
					System.out.println("Enter 1 for Calculating again");
					System.out.println("Enter any number for Exit");
					repitation = input.nextInt();
					if (repitation != 1){
						option = false;
					}	
				}
					break;
					
				case 2:  // Case for calculating BMI in (ib and in) 
				{
					System.out.print("Height (inches): ");
					height = (input.nextDouble()); // getting height from user 
					// Validation for height
					while (height <= 0){
						System.out.print("Height (inches): ");
						height = (input.nextDouble()); // getting height again from user 
					}
					System.out.print("Weight (ib): ");
					weight = input.nextDouble(); // getting weight from user
					// Validation for weight
					while (weight <= 0){
						System.out.print("Weight (ib): ");
						weight = input.nextDouble(); // getting weight again from user
 					}
					
					BMI = (float) ((weight/(height*height))*703); // calculatin BMI and making it 

					System.out.println("----------------------");
					
					/* Conditions to print BMI with its description */
					if (BMI < 18.5){
						System.out.printf("BMI is %.2f Underweight", BMI);
					}
					else if (BMI >= 18.5 && BMI<=24.9){
						System.out.printf("BMI is %.2f Normal ", BMI);
					}
					else if (BMI >= 25 && BMI<=29.9){
						System.out.printf("BMI is %.2f Overweight", BMI);
					}
					else if (BMI >= 30 && BMI<=34.9){
						System.out.printf("BMI is %.2f Obese", BMI);
					}
					else {
						System.out.printf("BMI is %.2f Extremely Obese", BMI);
					}        
					
					// Condition for calculation repitation
					System.out.println("");
					System.out.println("----------------------");
					System.out.println("Enter 1 for Calculating again");
					System.out.println("Enter any number for Exit");
					repitation = input.nextInt();
					if (repitation != 1){
						option = false;
					}
				}
					break;
				default:
					System.out.println("Menu does not contains that number, Please enter again");
			}
		} 
    }
}

