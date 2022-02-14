package developer;
import java.io.*;

import java.util.*;
import com.proj.*;
import developer.BusinessLevelOperation.*;
@SuppressWarnings("unused")
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
welcomeScreen();
try {
	menuDriven();
	
}catch(FileNotFoundException e) {
	e.printStackTrace();
}
	}
	public static void welcomeScreen() {
		System.out.println("Application Name:Locked Me\n");
		System.out.println("Developer Details:Developed by Ruchika Honawale\n");
	}
	public static void menuDriven()throws FileNotFoundException{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		BusinessLevelOperations obj =new BusinessLevelOperations();
		int option;
		do {
			System.out.println("Please select below options:\n ");
			System.out.println("\t1. Retriving files in Ascending Order:\n"); 
			System.out.println("\t2.Business Level Operations:\n");
			System.out.println("\t3.Exit the Application:\n");
			
			option =sc.nextInt();
			switch(option) {
			case 1:
				obj.showAllFiles();
				break;
			case 2:
				int ch;
				do {
		System.out.println("Enter your choice for Business Level Operations:\n ");
		System.out.println("\t1.Add file and Contens to the directory");		
		System.out.println("\t2.Delete a file from directory");		
		System.out.println("\t3.Search files and show the contents");	
		System.out.println("\t4.Back to Min menu");		
				
		ch=sc.nextInt();
		switch(ch){
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
				
			case 4:
				System.out.println("Exit from the Business Level Operation");
				System.out.println();
				break;
				default:
					System.out.println("Invalid choice please select correct choice");
		break;
		}
				}while(ch!=4);
		break ;
		case 3:
			System.out.println("Exit from the Application.");
	break;
	default:
		System.out.println("Invalid choice");
				}
			//system.out.println("Press 0 to continue");
		}while (option!=3);
			}
	}
			