package com.cg.trainingmanagementystem.ui;

import java.util.Scanner;

import com.cg.trainingmanagementsystem.collection.TrainerStaticDatabase;
import com.cg.trainingmanagementystem.exception.InvalidUserIdException;
import com.cg.trainingmanagementystem.service.entity.Course;
import com.cg.trainingmanagementystem.service.entity.Feedback;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;
import com.cg.trainingmanagementystem.services.AdminServices;
import com.cg.trainingmanagementystem.utility.TrainerCredentialValidation;

public class AdminControllers {
	private Trainer trainer;

	private Course course;

	private Feedback feedback;
	public AdminControllers() {
	}
public static void addSkillController() throws InvalidUserIdException 
{
	byte count=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Trainer Id:");
	String trainerId=scanner.next();
	
	if(TrainerCredentialValidation.trainerIdValidate(trainerId))
	{	
		System.out.println("List of skills We Require..Please enter only these");
		for (Skills s : Skills.values())  
			System.out.println(s);
		System.out.println("Enter number of skills you wanted to add:");
		try
		{
		count=scanner.nextByte();
		}
		catch(Exception exception)
		{
			throw new InvalidUserIdException("Please enter number only");
		}
		AdminServices.addSkillToTrainer(trainerId,count);
	}
	else
	{
		throw new InvalidUserIdException("Entered ID is not in valid format");
	}
}
}
