package Companylockers;
import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.io.File;


public class Lockedmecom {

	public static void main(String[] args) throws IOException {
		// should display application name  and developer details 
				//details of the user 
				
				String developer = "Rose Ngwenya";
				String name = "LockedME";
				
				String operations = "You have the freedom to perform these file operations \n" 
									+ "-Display all files in ascending or descending order \n"
									+ "-Create, delete and search the files in the main folder \n \n";
				
				System.out.println("\t  Welcome to the " + name + " prototype \n \n \t \t developed by " +developer);
				System.out.println("\n \n \tDeveloped for Company Lockers Pvt. Ltd. \n \n ");
				System.out.println(operations);
				
				String menu = "Choose which operation you want to perform and enter the number below \n"
							+ "1. Display all files in ascending order \n"
							+ "2. Add file \n"
							+ "3. Delete file \n"
							+ "4. Search file \n"
							+ "5. Return to main page \n"
							+ "6. Close the application";
				
				System.out.println(menu);
				
				//File Operations
				String fname;
				
				Scanner sc = new Scanner(System.in);
				
				int fchoice = sc.nextInt();
					System.out.println("You have chosen option " + fchoice );
					
					switch(fchoice) {
					case 1:
						//code to display all files in ascending order
						String mainpath = "C:\\mainFolder\\";
						File main = new File(mainpath);
						
						if (main.exists() && main.isDirectory()) {
							File arr[] = main.listFiles();
							
							System.out.println("Files from the main folder : ");
							
							
						}
						break;
					case 2: 
						//creating a new file
						
						Scanner sc1 =  new Scanner(System.in);
						System.out.println("Name the new file");
						fname = sc.next();
						File fileName = new File ("C:\\mainFolder\\" + fname);
						
						if (fileName.exists()) {
							System.out.println("The file already exists"); 
						}
							else {
								fileName.createNewFile();
								System.out.println("File has been created");
							}
						break;
						
					case 3:	//code to delete file
						Scanner sc2 = new Scanner(System.in);
						System.out.println("What is the file you want to delete?");
						
						//String fName = sc.nextLine();  
						fname = sc.next();
						File fileToGo = new File ("C:\\mainFolder\\" + fname); 
					
						
						if(fileToGo.exists())
						{
							System.out.println(fileToGo + " has been found");
							fileToGo.delete();
							System.out.println("File is Deleted...");
						}
						else
						{
							System.out.println("File not Found....");
						}
						break;
						
						
					case 4: //code to search for file
						
						Scanner sc3 = new Scanner(System.in);
						System.out.println("What is the file you searching for?");
						fname = sc.next();
						File fileWhere = new File ("C:\\mainFolder\\");
						
						if (fileWhere.exists()) {
							System.out.println(fileWhere + " exists in the directory" );
						} else {
							System.out.println(" File doesnt exist");
						}
							
						break;
					case 5: 
						// code to return to main menu
						System.out.println("\t  Welcome to the " + name + " prototype \n \n \t \t developed by " +developer);
						System.out.println("\n \n \tDeveloped for Company Lockers Pvt. Ltd. \n \n ");
						System.out.println(operations);
						System.out.println(menu);
						
						break;
					case 6:
						//code to exit the program
						System.out.println("Thank you for using app");
						System.exit(0);
						break;
						
					}
				

	}
		
	
}	