/*
Student:
U1910060
Alimov Abdullokh
MSC2070-002
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 
import java.util.Scanner;

public class IUT_BMI_U1910060  {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/iut_bmi?autoReconnect=true&useSSL=false", "root", "Hospital_808");
				    // Step 2: Allocate a 'Statement' object in the Connection
					Statement stmt = conn.createStatement();
				){

            if (conn != null) {
				System.out.println("Databse Connected!");
				Scanner input = new Scanner(System.in); //Object for Scanner
				boolean finishProgram=true;
				int menu;
				int employeeID, employeeHeight, employeeWeight;
				String employeeName;
				
                while(finishProgram){
					System.out.println(" -- Menu -- ");
					System.out.println("1. Insert Record ");
					System.out.println("2. Delete Record ");
					System.out.println("3. Show Records ");
					System.out.println("4. Update Record ");
					System.out.println("0. Quit ");
					System.out.print("Enter Choice: ");
					menu = (input.nextInt()); // menu choice to use switch cases
					switch(menu){
						case 1: //  Insert Record
						{	
							// Step 3: Execute a SQL SELECT query, the query result
							//  is returned in a 'ResultSet' object.
							System.out.println(" -- Input Info -- ");
							System.out.print("Employee ID: "); employeeID = (input.nextInt());							
							System.out.print("Employee Height: "); employeeHeight = (input.nextInt());
							System.out.print("Employee Weight: "); employeeWeight = (input.nextInt());
							System.out.print("Employee Name: "); employeeName = (input.next());
							
							String strSelect = "insert into Employee_BMI values ( " +employeeID+","+"'" +employeeName+"',"+" " +employeeHeight+","+" " +employeeWeight+")";
						
							System.out.println("The SQL query is: " + strSelect); // Echo For debugging
							System.out.println();
					 
							int count= stmt.executeUpdate(strSelect);
					 
							// Step 4: Process the ResultSet by scrolling the cursor forward via next().
							//  For each row, retrieve the contents of the cells with getXxx(columnName).
							conn.close();
						} 
							break;
						case 2: //  Delete Record
						{	
							// Step 3: Execute a SQL SELECT query, the query result
							//  is returned in a 'ResultSet' object.
							System.out.println(" -- Input Info -- ");
							System.out.print("Employee ID: "); employeeID = (input.nextInt());							
							
							// to delete record
							String strSelect ="delete from Employee_BMI where employeeID ="+ employeeID;
						
							System.out.println("The SQL query is: " + strSelect); // Echo For debugging
							System.out.println();
					 
							int count= stmt.executeUpdate(strSelect);
					 
							// Step 4: Process the ResultSet by scrolling the cursor forward via next().
							//  For each row, retrieve the contents of the cells with getXxx(columnName).
							conn.close();
						} 
							break;
						case 3: //  Show Records
						{	
							// Step 3: Execute a SQL SELECT query, the query result
							//  is returned in a 'ResultSet' object.
							String strSelect = "select * from Employee_BMI";
							System.out.println("The SQL query is: " + strSelect); // Echo For debugging
							System.out.println();
					 
							ResultSet rset = stmt.executeQuery(strSelect);
					 
							// Step 4: Process the ResultSet by scrolling the cursor forward via next().
							//  For each row, retrieve the contents of the cells with getXxx(columnName).
							System.out.println("The records selected are:");
							int rowCount = 0;
							while(rset.next()) {   // Move the cursor to the next row, return false if no more row
								employeeID = rset.getInt("employeeID"); 
								employeeHeight= rset.getInt("employeeHeight"); 
								employeeWeight= rset.getInt("employeeWeight");
								employeeName = rset.getString("employeeName");
								
								System.out.println(employeeID+ " " +employeeName+ " " +employeeHeight+ " " +employeeWeight );
								++rowCount;
							}
							 System.out.println("Total number of records = " + rowCount);
							conn.close();
						} 
							break;
						case 0: {
							finishProgram=false;
						}
							break;
					} // end switch
				}// end while
			} 
			else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
