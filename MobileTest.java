//import java.util.Scanner;

public class MobileTest  // Main Class
{
    public static void main(String[] args)
    {
        //Scanner input = new Scanner(System.in); //Object for Scanner
        Mobile mobile = new Mobile();
        mobile.Print();
    }
}


// --- Second Class ---

class Mobile
{
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

    void Print(){
        System.out.println(company);
    }


}
