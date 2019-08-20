package com.cg.trainingmanagementystem.services;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.cg.trainingmanagementystem.exception.InvalidUserIdException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.IFeedbackOperation;
import com.cg.trainingmanagementystem.service.ITrainerManagement;
import com.cg.trainingmanagementystem.service.entity.Course;
import com.cg.trainingmanagementystem.service.entity.Feedback;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;
import com.cg.trainingmanagementystem.service.impl.TrainerManagementImpl;
import com.cg.trainingmanagementystem.utility.DataExistenceCheck;
import com.cg.trainingmanagementystem.utility.TrainerCredentialValidation;

public class AdminServices {

	private Trainer trainer;

	private IFeedbackOperation feedbackOperation;

	private ITrainerManagement trainerManagement;

	private ICourseOperation courseOperation;

	private Course course;

	private Feedback feedback;

	private String generateTrainerId() {

		return "";
	}
	public static void addSkillToTrainer(String trainerId,byte count) throws InvalidUserIdException
	{	
		//function taking skills of trainer for addition and pass it to service layer
		Scanner scanner=new Scanner(System.in);
		
		
		
		
//		System.out.println("List of skills We Require..Please enter only these");
//		for (Skills s : Skills.values())  
//			System.out.println(s);
//		System.out.println("Enter number of skills you wanted to add");
//		byte count=scanner.nextByte();
		System.out.println("Now enter that " +count+ " skill you want to add from the above");
		Set<String> skilllist=new HashSet<String>();
		String skill;
		for(int i=1;i<=count;i++)
		{
			
			skill=scanner.next();
			if(DataExistenceCheck.DataBaseExistenceCheck(trainerId,skill))
			{
				skilllist.add(skill);
			}
				else
				throw new InvalidUserIdException("Entered skill is not according to our requirement!!..Please enter again");
		}

		ITrainerManagement itrainermanagement=new TrainerManagementImpl();
		if(itrainermanagement.addSkillsToTrainer(trainerId, skilllist))
			System.out.println("Skill is successfully added");
		else
			System.out.println("Trainer is not Registered");
		
		
	

}
}