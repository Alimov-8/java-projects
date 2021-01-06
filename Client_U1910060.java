/*
Student:
U1910060
Alimov Abdullokh
MSC2070-002
*/

import java.io.*;
import java.net.*;
import java.util.Scanner;  


public class Client_U1910060 
{
	private DataOutputStream toServer;
	private DataInputStream fromServer;
	public static void main(String[] args) 
	{    
		new Client_U1910060();
	}
	public Client_U1910060() 
	{
		try
		{
      			// Create a socket to connect to the server
      			Socket socket = new Socket("localhost", 8000);
      
			Scanner sc=new Scanner(System.in);  
			System.out.print("Please Enter Message in Lowercase letters: ");  
   			String lowerMessage = sc.next();  
			while(lowerMessage != "Exit"){
				// Create an input stream to receive data from the server
				fromServer = new DataInputStream(
				socket.getInputStream());
				
				// Create an output stream to send data to the server
				toServer =new DataOutputStream(socket.getOutputStream());
				toServer.writeUTF(lowerMessage);
				toServer.flush();
				String upperMessage = fromServer.readUTF();

				System.out.print("Your message in Uppercase Letters: " + upperMessage);
				System.out.println("");
				System.out.print("Please Enter Message in Lowercase letters: ");  
				lowerMessage=sc.next();
			}
			
		}
    		catch (IOException ex) 
		{
      			System.out.println(ex.toString() + '\n');
    		}
  	}
	
  
 }