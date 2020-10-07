/*
ID:      U1910060
Name:    Alimov Abdullokh
Section: 002
*/
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Object for Scanner
        double height, weight;
        int BMI;
        
        System.out.print("Height (sm): ");
        height = (input.nextDouble())/100; // getting height from user and changing it to meters
        
        System.out.print("Weight (kg): ");
        weight = input.nextDouble(); // getting weight from user

        BMI = (int) (weight/(height*height)); // calculatin BMI and making it (int)

        /* Conditions to print BMI with its description */
        if (BMI < 11){
            System.out.println("BMI is "+BMI+" Extremely Underweight");
        }
        else if (BMI >= 12 && BMI<=18){
            System.out.println("BMI is "+BMI+" Underweight");
        }
        else if (BMI >= 19 && BMI<=24){
            System.out.println("BMI is "+BMI+" Healthy");
        }
        else if (BMI >= 25 && BMI<=29){
            System.out.println("BMI is "+BMI+" Overweight");
        }
        else if (BMI >= 30 && BMI<=39){
            System.out.println("BMI is "+BMI+" Obese");
        }
        else {
            System.out.println("BMI is "+BMI+" Extremely Obese");
        }
        
    }
}
