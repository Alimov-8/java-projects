/*
Student:
U1910060
Alimov Abdullokh
Section: 002
*/

import java.util.Scanner;

public class MobileTestU1910060  // Main Class
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Object for Scanner

        // Object no parameter
        Mobile mobile_1 = new Mobile();
        // Object with Parameter
        Mobile mobile_2 = new Mobile("Samsung", "S10+", false, true, 512.00, 1  );

        // data for creating menu
        boolean option = true;
        int menu;
        // --- Data fields ---
        String c, m;
        boolean o, hC;
        double mmy;
        int vl;

        // Menu part
        while(option){
            System.out.println("--- Menu ---");
            System.out.println("1. Set Details");
            System.out.println("2. Get Details");
            System.out.println("3. Increase Volume");
            System.out.println("4. Decrease Volume");
            System.out.println("5. Switch On Mobile");
            System.out.println("6. Switch Off Mobile");
            System.out.println("7. Exit");
            System.out.println(" Your Choice: ");
            menu = input.nextInt();

            switch(menu){
                case 1:{ //Set Data
                    System.out.print("Company : "); c=input.next();
                    mobile_2.setCompany(c);
                    System.out.print("Model : "); m=input.next();
                    mobile_2.setModel(m);
                    System.out.print("On : "); o=input.nextBoolean();
                    mobile_2.setOn(o);
                    System.out.print("Camera : " ); hC=input.nextBoolean();
                    mobile_2.setHasCamera(hC);
                    System.out.print("Memory : "); mmy=input.nextDouble();
                    mobile_2.setMemory(mmy);
                    System.out.print("Volume: " ); vl=input.nextInt();
                    if (vl<11 && vl>-1) {
                        mobile_2.setVolume(vl);
                    }
                    else{
                        System.out.println("Your input not valid, program will consider volume as 0");
                        mobile_2.setVolume(0);
                    }

                }
                    break;
                case 2:{ //Get Data
                    System.out.println("Company : " + mobile_2.getCompany());
                    System.out.println("Model : " + mobile_2.getModel());
                    System.out.println("On : " + mobile_2.getOn());
                    System.out.println("Camera : " + mobile_2.getHasCamera());
                    System.out.println("Memory : " + mobile_2.getMemory());
                    System.out.println("Volume: " + mobile_2.getVolume());
                }
                    break;
                case 3:{
                    mobile_2.increaseVolume();
                }
                    break;
                case 4:{
                    mobile_2.decreaseVolume();
                }
                    break;
                case 5:{
                    mobile_2.switchOn();
                }
                    break;
                case 6:{
                    mobile_2.switchOff();
                }
                    break;
                case 7:{
                    option = false;
                }
                break;
            }
        }
    }
}


// --- Second Class ---
class Mobile
{
    Scanner input = new Scanner(System.in); //Object for Scanner

    // --- Data fields ---
    String company, model;
    boolean on, hasCamera;
    double memory;
    int volume;

    // --- Constructor ---
    Mobile(){  // No parameter
        company = "";
        model = "";
        on = false;
        hasCamera = false;
        memory = 0.0;
        volume = 0;
    }
    Mobile(String comp,String mdl, boolean onOff, boolean hasCam, double mry, int val){ // with parameter
        company = comp;
        model = mdl;
        on = onOff;
        hasCamera = hasCam;
        memory = mry;
        volume = val;
    }

    // --- Methods ---
    void switchOn(){
        on = true;
    }

    void switchOff(){
        on = false;
    }

    void increaseVolume(){
        if (volume< 10) {
            volume++;
        }
    }

    void decreaseVolume(){
        if (volume >= 1){
            volume--;
        }
    }

    // --- Set and Get Methods for variables ---
    void setCompany(String comp){
        company = comp;
    }
    String getCompany(){
        return company;
    }

    void setModel(String mdl){
        model = mdl;
    }
    String getModel(){
        return model;
    }

    void setOn(boolean onOff){
        on = onOff;
    }
    boolean getOn(){
        return on;
    }

    void setHasCamera(boolean hasCam){
        hasCamera = hasCam;
    }
    boolean getHasCamera(){
        return hasCamera;
    }

    void setMemory(double mry){
        memory = mry;
    }
    double getMemory(){
        return memory;
    }

    void setVolume(int val){
        volume = val;
    }
    int getVolume(){
        return volume;
    }
}
