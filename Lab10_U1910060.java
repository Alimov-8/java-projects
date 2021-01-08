/* Student
ID: U1910060
Name: Abdullokh Alimov
MSC2070-002
*/
 
class threadPrime extends Thread
{
	public void run()
	{		
		boolean primeNumber = true; // Initial point
		for(int i=1;i<=10;i++){ // Loop for (1 ... 10) numbers generator
			for(int j=2;j<=(i/2);j++){  // Prime Checker    
				if(i%j == 0){
					primeNumber = false;
				}	
			}
			if (primeNumber || i == 2 || i == 1) { // Prime Printer
				System.out.println("Thread Prime:     " + i);
			}
			primeNumber= true;
		}
	}
}

class threadNonPrime extends Thread
{
	public void run()
	{		
		boolean primeNumber = true; // Initial point
		for(int i=1;i<=10;i++){ // Loop for (1 ... 10) numbers generator
			for(int j=2;j<=(i/2);j++){  // Prime Checker    
				if(i%j == 0){
					primeNumber = false;
				}	
			}
			if (primeNumber == false) { // Prime Non Printer
				System.out.println("Thread NON-Prime:  " + i);
			}
			primeNumber= true;
		}
	}
}

public class Lab10_U1910060
{
	public static void main(String[] arg)
	{
		threadPrime t1 = new threadPrime();
		threadNonPrime t2 = new threadNonPrime();
			
		t1.start(); // Prime 
		t2.start(); // Non Prime 
		
	}
}
