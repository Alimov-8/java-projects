/*
ID     : U1910060
Name   : Abdullokh Alimov
Section: (MSC2070-002)
*/

import java.util.Scanner;
import java.util.function.ObjDoubleConsumer;


// --- Main Class ---
public class DoM_Application
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Object for Scanner
        // Objects
        CityTemperature T = new CityTemperature();
        CityRainFall R = new CityRainFall();

        int menu;
        boolean option = true;

        // Menu part
        while(option){
            System.out.println("--- Menu ---");
            System.out.println("1. Set city wise hourly (00:00  to 23:00 ) temperature information.");
            System.out.println("2. Get city wise hourly (00:00  to 23:00 ) temperature information.");
            System.out.println("3. Set city wise yearly (from January to December) rainfall information.");
            System.out.println("4. Get city wise yearly (from January to December) rainfall information.");
            System.out.println("5. Set yearly climate data (from January to December) for city.");
            System.out.println("6. Get yearly climate data (from January to December) for city.");
            System.out.println("7. Exit");
            System.out.println(" Your Choice: ");
            menu = input.nextInt();

            switch(menu){
                case 1:{ // Set Data Temperature
                    T.setClimateData();
                }
                    break;
                case 2:{ //Get Data Temperature
                    T.getClimateData();
                }
                    break;
                case 3:{ //Set Data RainFall
                    R.setClimateData();
                }
                    break;
                case 4:{ //Get Data RainFall
                    R.getClimateData();
                }
                    break;
                case 5:{ //Set Data Year Temperature
                    T.setClimateDataYear();
                }
                    break;
                case 6:{ //Get Data Year Temperature
                    T.getClimateDataYear();
                }
                    break;
                case 7:{ // Exit
                    option = false;
                }
                    break;
            }
        }
    }
}


// --- Superclass ---
class City
{
    // --- Data Fields ---
    private int cityID;
    private String cityName;

    // --- Methods ---
    public void setCityID(int cityID)
    {
        this.cityID = cityID;
    }
    public int getCityID()
    {
        return cityID;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }
    public String getCityName()
    {
        return cityName;
    }
}


// --- 1st Sub class for Temperature ---
class CityTemperature extends City
{
    Scanner input = new Scanner(System.in); //Object for Scanner

    // --- Data Fields ---
    private double[] cityClimateData = new double[24];
    double temperature;
    String cityName;
    int cityID;

    // --- Methods ---
    public void setClimateData()
    {
        System.out.print("Enter ID  :"); cityID = input.nextInt();
        System.out.print("Enter Name:"); cityName = input.next();
        super.setCityID(cityID);
        super.setCityName(cityName);
        System.out.println(" Enter Data for Temperature from 00:00 to 24:00");
        for (int i = 0; i < 24; i++)
        {
            System.out.print(i + ":00 "); cityClimateData[i] = input.nextDouble();
        }
    }

    public void getClimateData()
    {
        System.out.println(super.getCityID()+ " " + super.getCityName()+" Date of Temperature:");
        for (int i = 0; i < 24; i++){
            System.out.println(i + ":00 " + cityClimateData[i] + "(C)");
            temperature = temperature + cityClimateData[i];
        }
        temperature = (double) temperature / 24;
        System.out.println("Average "+temperature+" C'");
    }

    // Yearly
    public void setClimateDataYear()
    {
        System.out.print("Enter ID  :"); cityID = input.nextInt();
        System.out.print("Enter Name:"); cityName = input.next();
        super.setCityID(cityID);
        super.setCityName(cityName);
        System.out.println(" Enter Data for Temperature from January to December");
        for (int i = 1; i <= 12; i++)
        {
            System.out.print(i + ". "); cityClimateData[i] = input.nextDouble();
        }
    }

    public void getClimateDataYear()
    {
        System.out.println(super.getCityID()+ " " + super.getCityName()+" Date of Temperature:");
        for (int i = 1; i <= 12; i++){
            System.out.println(i + ". " + cityClimateData[i] + "(C)");
            temperature = temperature + cityClimateData[i];
        }
        temperature = (double) temperature / 12;
        System.out.println("Average "+temperature+" C'");
    }
}


// --- 2nd Sub class for Rainfall ---
class CityRainFall extends City
{
    Scanner input = new Scanner(System.in); //Object for Scanner

    // --- Data Fields ---
    private double[] cityClimateData = new double[12];
    double rainfall;
    String cityName;
    int cityID;

    // --- Methods ---
    public void setClimateData()
    {
        System.out.print("Enter ID  :"); cityID = input.nextInt();
        System.out.print("Enter Name:"); cityName = input.next();
        super.setCityID(cityID);
        super.setCityName(cityName);
        System.out.println(" Enter Data for RainFall from January (1) to December (12) ");
        int Order = 1;
        for (int i = 0; i < 12; i++)
        {
            System.out.print(Order + ". "); cityClimateData[i] = input.nextDouble();
            Order++;
        }
    }

    public void getClimateData()
    {
        System.out.println(super.getCityID()+ " " + super.getCityName()+" Date of RainFall:");
        int Order = 1;
        for (int i = 0; i < 12; i++){
            System.out.println(Order + ". " + cityClimateData[i] + " (mm)");
            rainfall = rainfall + cityClimateData[i];
            Order++;
        }
        rainfall = (double) rainfall / 12;
        System.out.println("Average RainFall "+rainfall+" (mm)");
    }
}

