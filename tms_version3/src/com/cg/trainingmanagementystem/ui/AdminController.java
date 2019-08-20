package com.cg.trainingmanagementystem.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.cg.trainingmanagementsystem.collection.TrainerStaticDatabase;
import com.cg.trainingmanagementystem.exception.InvalidUserIdException;
import com.cg.trainingmanagementystem.exception.NoSkillInDatabaseException;
import com.cg.trainingmanagementystem.exception.SkillNotMatchedException;
import com.cg.trainingmanagementystem.service.ITrainerManagement;
import com.cg.trainingmanagementystem.service.entity.Course;
import com.cg.trainingmanagementystem.service.entity.Feedback;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;
import com.cg.trainingmanagementystem.service.impl.TrainerManagementImpl;
import com.cg.trainingmanagementystem.services.AdminServices;
import com.cg.trainingmanagementystem.utility.TrainerCredentialValidation;

/**
 * 
 */
public class AdminController {

	public AdminController() {
	}

	private Trainer trainer;

	private Course course;

	private Feedback feedback;
	public static void addSkillControllers() throws InvalidUserIdException
	{	
		Scanner scanner=new Scanner(System.in);
		ITrainerManagement itrainermanagement;
		System.out.println("Enter the Trainer Id:");
		String trainerId=scanner.next();
		//AdminServices.addSkillToTrainer(trainerId);
		System.out.println("List of skills We Require");
		for (Skills s : Skills.values())  
			System.out.println(s);
		System.out.println("Enter number of skills you wanted to add");
		byte count=scanner.nextByte();
		System.out.println("Now enter that" +count+ " skill you want to add from the above");
		Set<String> skilllist=new HashSet<String>();
		String skill;
		for(int i=1;i<=count;i++)
		{
			
			skill=scanner.next();
		
			skilllist.add(skill);
		}
//		Trainer trainer=new Trainer();
//		trainer.setTrainerId(trainerId);
//		trainer.setSkills(skilllist);
		itrainermanagement=new TrainerManagementImpl();
		if(itrainermanagement.addSkillsToTrainer(trainerId, null))
			System.out.println("Skill is successfully added");
		else
			System.out.println("Trainer is not Registered");
	}
	//funtion to delete skill of trainer
	public static void delSkillController() throws InvalidUserIdException,NoSkillInDatabaseException,SkillNotMatchedException
	{
		Scanner scanner=new Scanner(System.in);
		ITrainerManagement itrainermanagement;
		//boolean check=false;
		System.out.println("Enter the Trainer Id:");
		String trainerId=scanner.next();
		if(TrainerCredentialValidation.trainerIdValidate(trainerId) && TrainerCredentialValidation.trainerRegistrationCheck(trainerId))
		{
			Set<Trainer> trainer;
			trainer=TrainerStaticDatabase.trainer;
			Iterator value = trainer.iterator();
			
			while(value.hasNext())
			{
				Trainer tt=(Trainer)value.next();

				if((tt.getTrainerId()).equals(trainerId))
				{
					System.out.println(tt.getTrainerName()+" We are fetching your skills please wait");
					itrainermanagement=	new TrainerManagementImpl();
					itrainermanagement.delSkillsToTrainer(trainerId, null);
					//check=true;
				}
				
			}
			
			
		}
		else
		{
			throw new InvalidUserIdException("Entered id is not registered");
		}
		
		
		
}
	//function to add skill to trainer
//	public static void addSkillController() throws InvalidUserIdException 
//	{
//		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the Trainer Id:");
//		String trainerId=scanner.next();
//		
//		if(TrainerCredentialValidation.trainerIdValidate(trainerId))
//		{
//			AdminServices.addSkillToTrainer(trainerId);
//		}
//		else
//		{
//			throw new InvalidUserIdException("Entered ID is not in valid format");
//		}
//	}

}