/*
Student:
U1910060
Alimov Abdullokh
MSC2070-002
*/

import java.io.*;
import java.net.*;
import java.util.*;

public class Server_U1910060  
{ 
  
	public static void main(String[] args) 
	{
    		new Server_U1910060();
	}

	public Server_U1910060()// constructor
	{
    		try 
		{
      			// Create a server socket
      			ServerSocket serverSocket = new ServerSocket(8000);
      			System.out.println("Server started at " + new Date() + '\n');

      			// Listen for a connection request
      			Socket socket = serverSocket.accept();

      			// Create data input and output streams
      			DataInputStream inputFromClient = new DataInputStream(
        		socket.getInputStream());
      			DataOutputStream outputToClient = new DataOutputStream(
        		socket.getOutputStream());

      			while (true)
			{
        			// Receive radius from the client
        			String lowerMessgae = inputFromClient.readUTF();

				InetAddress ip=socket.getInetAddress(); 
  				System.out.println("Host Name: "+ip.getHostName());  
				System.out.println("IP Address: "+ip.getHostAddress());  
				 System.out.println("We have received Message "+ lowerMessgae);
        			
				// Make Meassage Uppercase Leters 
        			String upperMessage = lowerMessgae.toUpperCase();
					
        			// Send area back to the client
        			outputToClient.writeUTF(upperMessage);
 			}
    		}
    		catch(IOException ex)
		{
      			System.err.println(ex);
    		}
  	}
}