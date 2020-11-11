/*
ID     : U1910060
Name   : Abdullokh Alimov
Section: (MSC2070-002)
*/


import java.util.Scanner;


// --- Main Class ---
public class ProductDemoU1910060
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Object for Scanner
        // Objects
        TV t = new TV();
        Mobile m = new Mobile();

        // --- Data Fields ---
        int productID, volume, channel, noOfSim;
        String companyName, modelName;
        boolean on;
        boolean loop = true;
        int menu, menuTV, menuMobile;

        // Menu part
        while(loop){
            System.out.println(" ");
            System.out.println("--- Menu ---");
            System.out.println("1. TV");
            System.out.println("2. Mobile");
            System.out.println("3. Exit");
            System.out.println(" Your Choice: ");
            menu = input.nextInt();

            switch(menu){
                case 1:{ // TV

                    for(int i = 0; i<100; i++){
                        System.out.println(" ");
                        System.out.println("--- Menu TV ---");
                        System.out.println("1. Set Details");
                        System.out.println("2. Get Details");
                        System.out.println("3. Switch On");
                        System.out.println("4. Switch Off");
                        System.out.println("5. Volume +");
                        System.out.println("6. Volume -");
                        System.out.println("7. Back to Menu");
                        System.out.println(" Your Choice: ");
                        menuTV = input.nextInt();
                            switch(menuTV){
                                case 1:{ // Set Data
                                    System.out.println("Product ID : "); productID=input.nextInt();
                                    t.setProductID(productID);
                                    System.out.println("Company Name : "); companyName=input.next();
                                    t.setCompanyName(companyName);
                                    System.out.println("Model Name : "); modelName=input.next();
                                    t.setModelName(modelName);
                                    System.out.println("ON/OFF -> true/false : " ); on=input.nextBoolean();
                                    t.setOn(on);
                                    System.out.println("Channel Number : " ); channel=input.nextInt();
                                    t.setChannel(channel);
                                    System.out.println("Volume: " ); volume=input.nextInt();
                                    if (volume<11 && volume>-1) {
                                        t.setVolume(volume);}
                                    else{
                                        System.out.println("Your input not valid, program will consider volume as 0");
                                        t.setVolume(0);}
                                }
                                    break;
                                case 2:{ // Get Data
                                    System.out.println("Product ID : " + t.getProductID());
                                    System.out.println("Company Name : " + t.getCompanyName());
                                    System.out.println("Model Name : " + t.getModelName());
                                    System.out.println("ON/OFF : " + t.getOn());
                                    System.out.println("Channel : " + t.getChannel());
                                    System.out.println("Volume : " + t.getVolume());
                                }
                                    break;
                                case 3:{
                                    t.switchOn();
                                }
                                    break;
                                case 4:{
                                    t.switchOff();
                                }
                                    break;
                                case 5:{
                                    t.increaseVolume();
                                }
                                    break;
                                case 6:{
                                    t.decreaseVolume();
                                }
                                    break;
                                case 7:{ // Exit
                                    i = 101;
                                }
                                    break;
                            } // end switch

                    }
                } // end menuTV
                    break;

                case 2:{ // Mobile

                    for(int i = 0; i<100; i++){
                        System.out.println(" ");
                        System.out.println("--- Menu Mobile ---");
                        System.out.println("1. Set Details");
                        System.out.println("2. Get Details");
                        System.out.println("3. Switch On");
                        System.out.println("4. Switch Off");
                        System.out.println("5. Volume +");
                        System.out.println("6. Volume -");
                        System.out.println("7. Change NumberOfSim");
                        System.out.println("8. Back to Menu");
                        System.out.println(" Your Choice: ");
                        menuTV = input.nextInt();
                        switch(menuTV){
                            case 1:{ // Set Data
                                System.out.println("Product ID : "); productID=input.nextInt();
                                m.setProductID(productID);
                                System.out.println("Company Name : "); companyName=input.next();
                                m.setCompanyName(companyName);
                                System.out.println("Model Name : "); modelName=input.next();
                                m.setModelName(modelName);
                                System.out.println("ON/OFF -> true/false : " ); on=input.nextBoolean();
                                m.setOn(on);
                                System.out.println("Volume: " ); volume=input.nextInt();
                                if (volume<11 && volume>-1) {
                                    m.setVolume(volume);}
                                else{
                                    System.out.println("Your input not valid, program will consider volume as 0");
                                    m.setVolume(0);}
                                System.out.println("Number of SimCard : " ); noOfSim=input.nextInt();
                                m.setNoOfSim(noOfSim);

                            }
                            break;
                            case 2:{ // Get Data
                                System.out.println("Product ID : " + m.getProductID());
                                System.out.println("Company Name : " + m.getCompanyName());
                                System.out.println("Model Name : " + m.getModelName());
                                System.out.println("ON/OFF : " + m.getOn());
                                System.out.println("Volume : " + m.getVolume());
                                System.out.println("No SimCard : " + m.getNoOfSim());
                            }
                                break;
                            case 3:{
                                m.switchOn();
                            }
                                break;
                            case 4:{
                                m.switchOff();
                            }
                                break;
                            case 5:{
                                m.increaseVolume();
                            }
                                break;
                            case 6:{
                                m.decreaseVolume();
                            }
                                break;
                            case 7:{
                                System.out.println("new Number of SimCard : " ); noOfSim=input.nextInt();
                                m.changeNoOfSim(noOfSim);
                            }
                                break;
                            case 8:{ // Exit
                                i = 101;
                            }
                            break;
                        } // end switch

                    }

                } // end menuMobile
                    break;

                case 3:{ //Exit
                    loop = false;
                }
                    break;
            } // end switch
        } // end while loop
    }
}


// --- Interface ---
interface Operatable
{
    // --- Methods ---
    public void increaseVolume(); // interface method (does not have a body)
    public void decreaseVolume();
    public void switchOn();
    public void switchOff();
}


// --- Abstract Class ---
abstract class Product implements Operatable
{
    // --- Data Fields ---
    private int productID, volume;
    private String companyName, modelName;
    private boolean on;

    // --- Constructor ---
    Product(){  // No parameter
        productID = 0;
        companyName = "";
        modelName = "";
        on = false;
        volume = 0;
    }

    // --- Methods ---
    public void setProductID(int productID)
    {
        this.productID = productID;
    }
    public int getProductID()
    {
        return productID;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    public String getCompanyName()
    {
        return companyName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }
    public String getModelName()
    {
        return modelName;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    public int getVolume()
    {
        return volume;
    }

    public void setOn(boolean on){
        this.on = on;
    }
    public boolean getOn(){
        return on;
    }

}


// --- Concrete Class TV (Subclass for Product) ---
class TV extends Product
{
    Scanner input = new Scanner(System.in); //Object for Scanner

    // --- Data fields ---
    private int channel;

    // --- Constructor ---
    TV(){  // No parameter
        channel = 0;
    }

    // --- Methods ---
    public void increaseVolume()
    {
        if (getOn()){
            if (getVolume() < 10){
                setVolume(getVolume() + 1);}}
        else System.out.println("Switch On your TV");
    }
    public void decreaseVolume(){
        if (getOn()){
            if (getVolume() >= 1){
                setVolume(getVolume() - 1);}}
        else System.out.println("Switch On your TV");
    }

    public void switchOn(){
        setOn(true);
    }
    public void switchOff(){
        setOn(false);
    }

    public void setChannel(int channel)
    {
        if (getOn()){
            if (channel>=0 && channel<=100){
                this.channel = channel;}
            else{
                System.out.println("Your input not correct, channel initialize  to 0");
                this.channel = 0;}}
        else System.out.println("Switch On your TV");
    }
    public int getChannel()
    {
        return channel;
    }

}


// --- Concrete Class Mobile (Subclass for Product) ---
class Mobile extends Product
{
    Scanner input = new Scanner(System.in); //Object for Scanner

    // --- Data fields ---
    private int noOfSim;

    // --- Constructor ---
    Mobile(){  // No parameter
        noOfSim = 0;
    }

    // --- Methods ---
    public void increaseVolume()
    {
        if (getOn()){
            if (getVolume() < 10){
                setVolume(getVolume() + 1);}}
        else System.out.println("Switch On your Mobile");
    }
    public void decreaseVolume(){
        if (getOn()){
            if (getVolume() >= 1){
                setVolume(getVolume() - 1);}}
        else System.out.println("Switch On your Mobile");
    }

    public void switchOn(){
        setOn(true);
    }
    public void switchOff(){
        setOn(false);
    }

    public void setNoOfSim(int noOfSim)
    {
        this.noOfSim = noOfSim;
    }
    public int getNoOfSim()
    {
        return noOfSim;
    }

    public void changeNoOfSim(int noOfSim)
    {
        if(getOn()){
            this.noOfSim = noOfSim;
        }
        else System.out.println("Switch On your Mobile");
    }

}
