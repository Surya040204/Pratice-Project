package main;

import Scholar.dao.ScholarDao;
import Scholar.dao.ScholarDaoInterface;
import Scholar.model.Scholar;

import java.util.Scanner;

public class Hcl {
    private static boolean f;
	private static boolean ff;
	private static boolean ans;
	private static boolean flag;
	public static int Id;
	public static int ID;
	public static int id;
	public static int st;
	public static int choice;
	public static int ch;
	public static String name;
	public static String age;
	public static String SapId;
	public static String location;
	public static String sname;
	public static String Age;
	
	public static void main(String[] args) {
		// Scanner class to give console based inputs
        Scanner sc=new Scanner(System.in);

        //Object creation
        ScholarDaoInterface dao=new ScholarDao();
        System.out.println("Welcome to Hcl Scholar Management application");
        while(true){
            System.out.println("\n1.Add Scholar" +
                    "\n2.Show All Scholar+" +
                    "\n3.Get Scholar based on id+" +
                    "\n4.Delete Scholar"+
                    "\n5.Update Scholar" +
                    "\n6.Exit");
            //The main interface of application
            System.out.println("Enter choice");
            ch=sc.nextInt();
            // switch cases for different modules of application
            switch (ch){
                case 1:
                    System.out.println("Add Scholar");  // case for adding the scholar module
                    System.out.println("Enter Scholar name");
                    name=sc.next();
                    System.out.println("Enter Scholar Age");
                    age=sc.next();
                    System.out.println("Enter SapId");
                    SapId=sc.next();
                    System.out.println("Enter Location");
                    location=sc.next();
                    // object creation for scholar
                    Scholar st=new Scholar(name,age,SapId,location);
                    //along with parameters
                    ans=dao.insertScholar(st);
                    if(ans)
                        System.out.println("Scholar details inserted Successfully!!!");
                    else
                        System.out.println("something went wrong, please try again");
                    // break statement takes the flow of control out of the switch statement
                    break;
                case 2:
                	//Case of getting all the scholars from the database
                    System.out.println("Show all Scholar ");
                    dao.showAllScholar();
                    
                    break;
                case 3:
                    //Case of getting particular scholar details
                    System.out.println("Get Scholar based on id");
                    //via id
                    System.out.println("enter id");
                    id=sc.nextInt();
                    f = dao.showScholarById(id);
                    //Condition if scholar ID is not available in database

                  if(f) {
                      System.out.println("Scholar with this id is available in our system");}
                      else 
                    	  {System.out.println("Scholar with this id is not available in our system");}
                  //break statement takes the flow of control out of switch statement
                    break;
                case 4:                	
                	 // Case for deletion of the students                     
                	System.out.println("Delete Scholar");
                      System.out.println("Enter  ID to delete");
                	 Id = sc.nextInt();
                	 ff= dao.showScholarById(Id);
                	 if (ff) {
                	 ff = dao.delete(Id);
                	 System.out.println("Scholar details deleted successfully...");
                	 } else {
                	 System.out.println("Scholar with this ID is not available in our system");}
                     // break statement takes the flow of control out of the switch statement
                	 break;
                	
                case 5:
                	//Case for updating the details of scholar
                    System.out.println("Update the Scholar details");
                    System.out.println("\n1.Update name\n2.Update location");
                    System.out.println("enter your choice");
                    choice=sc.nextInt();
                    //Choices are again divided for multiple details updating
                    if(choice==1){
                        System.out.println("enter id");
                        ID=sc.nextInt();
                        //Scholar name updating
                        System.out.println("Enter new name");
                        sname=sc.next();
                        Scholar std=new Scholar();
                        std.setName(sname);
                        //Dao refers to data access object
                      flag=  dao.update(ID,sname,choice,std);
                      if(flag)
                          System.out.println(" Scholar name updated successfully");
                      else
                          System.out.println("Something went wrong...");
 }
                       else if(choice==2){
                        System.out.println("enter id");
                        ID=sc.nextInt();
                        //Scholar age updating
                        System.out.println("Enter correct location");
                        location=sc.next();
                        Scholar std=new Scholar();
                        std.setLocation(location);
                        //Dao refers to data access object
                      flag=  dao.update(ID,location,choice,std);
                      // flag is used to let program know that certain conditions are met
                      if(flag)
                          System.out.println(" Scholar age updated successfully");
                      else
                          System.out.println("Something went wrong...");
 }
                    //break statement takes the flow of control out of switch statement
                    break;
                case 6:
                    System.out.println("Thank You for using HCL Scholar management application!!!");
                    //Terminates the current java running machine
                    System.exit(0);
                    //Exiting the application and terminating the program
                default:
                	//to specify the set of statements to execute if
                	// there is no case match 
                    System.out.println("Please enter valid choice....");
            }
        }


    }
}