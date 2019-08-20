package com.cg.trainingmanagementystem.ui;
import java.util.Scanner;
import com.cg.trainingmanagementsystem.collection.TrainerStaticDatabase;


public class AdminMain {

	public static void main(String[] args) {
		
		//Initializing static database
		TrainerStaticDatabase.initiateTrainerDatabase();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"---------------------------Welcome To Training Managenment System-----------------------------------------------------");
		System.out.println(
				"---------------------------                                      -----------------------------------------------------");
		System.out.println(
				"###########################Welcome to Trainer Management Module#######################################################");
		//System.out.println("Please Choose Any Admin Service");
		do {
			//Displaying application format
			System.out.println("Please Choose Any Admin Service");
			System.out.println("1.Feedback Operations");
			System.out.println("2.Course Operations");
			System.out.println("3.Trainer Management Operations");
			System.out.println("4.Log Out");
			try {
				byte choice = scanner.nextByte();

				switch (choice) {

				case 3:
					trainerRelatedServices();
					break;

				case 4:
					System.out.println("You logged out from system");
					System.exit(0);
				default:	System.out.println("Wrong option selected...Choose again");
							break;
				}
			} catch (Exception e) {
				System.out.println("Please enter choice in correct format!!!!");
				System.out.println("Press ctrl+F11 to continue!!!!");
				break;
			}

		} while (true);

	}

	public static void trainerRelatedServices() {
		//Displaying the Major Admin operations
		System.out.println("Trainer Management Operation Selected");
		System.out.println("Please Select any one operation:");
		System.out.println("1.Add skills to Trainer");
		System.out.println("2.Delete skills to Trainer");
		System.out.println("3.Get Trainer Details");
		System.out.println("4.Create Trainer");
		System.out.println("5.Get All Trainers");
		System.out.println("6.Exit");
		System.out.println("Please Enter your Choice:");
		Scanner scanner = new Scanner(System.in);
		byte response = scanner.nextByte();
		switch (response) {

		case 1:
			try {
				
				//Call to admin helper class
				AdminControllers.addSkillController();
				

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
				//call to admin helper class
				AdminController.delSkillController();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		default:	
					break;
		}

	}

}
