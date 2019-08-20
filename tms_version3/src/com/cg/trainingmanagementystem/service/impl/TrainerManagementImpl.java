package com.cg.trainingmanagementystem.service.impl;

import java.util.*;

import com.cg.trainingmanagementsystem.collection.TrainerStaticDatabase;
import com.cg.trainingmanagementsystem.dao.ICrudOperation;
import com.cg.trainingmanagementsystem.dao.impl.TrainerManagementDaoImpl;
import com.cg.trainingmanagementystem.exception.InvalidUserIdException;
import com.cg.trainingmanagementystem.exception.NoSkillInDatabaseException;
import com.cg.trainingmanagementystem.exception.SkillNotMatchedException;
import com.cg.trainingmanagementystem.service.ITrainerManagement;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;
import com.cg.trainingmanagementystem.utility.DataExistenceCheck;
import com.cg.trainingmanagementystem.utility.TrainerCredentialValidation;

/**
 * 
 */
public class TrainerManagementImpl implements ITrainerManagement {

	@Override
	public boolean addSkillsToTrainer(String trainerId, Set<String> skill) throws InvalidUserIdException  {
		// TODO Auto-generated method stub
		if(TrainerCredentialValidation.trainerIdValidate(trainerId))
		{
			
			Set<Trainer> trainer;
			trainer=TrainerStaticDatabase.trainer;
			Iterator value = trainer.iterator();
			boolean response=false;
			while(value.hasNext())
			{
				Trainer tt=(Trainer)value.next();
				if(tt.getTrainerId().equals(trainerId))
				{
					Set<String> retSkills=tt.getSkill();
					System.out.println("Hello "+tt.getTrainerName()+" you posses following skills before addition:");
					
					for (String s : retSkills)  
							System.out.println(s);	
					
					
					
					ICrudOperation<Trainer> iCrudOperation =new TrainerManagementDaoImpl();
					iCrudOperation.trainerSkillAddition(tt, skill);
					response=true;
					break;
				}
			}
//			Trainer trainer=new Trainer();
//			trainer.setSkills(skill);
//			
//			System.out.println("Skills you have after addition are:");
//			for (String s : skill)  
//				System.out.println(s);
			
			return response;
		}
		else
		return false;
	}

	@Override
	public boolean delSkillsToTrainer(String trainerId, Set<String> skills) throws NoSkillInDatabaseException,SkillNotMatchedException{
		
		Set<Trainer> trainer;
		byte count=0;
		trainer=TrainerStaticDatabase.trainer;
		Iterator value = trainer.iterator();
		boolean response=false;
		while(value.hasNext())
		{
			Trainer currentTrainer=(Trainer)value.next();
			if(currentTrainer.getTrainerId().equals(trainerId))
			{
				Set<String> retSkills=currentTrainer.getSkill();
				if(retSkills.isEmpty())
					throw new NoSkillInDatabaseException("You have no skills to delete");
				else
				{
				System.out.println("Hello "+currentTrainer.getTrainerName()+" you posses following skills:");
				
				for (String string : retSkills)  
						System.out.println(string);
						response=true;
						Scanner scanner =new Scanner(System.in);
						System.out.println("Enter number of skills you wanted to Delete");
						try
						{
							 count=scanner.nextByte();
						}
						catch(Exception e)
						{
							throw new NoSkillInDatabaseException("Enter number only");
						}
						
						System.out.println("Now enter that " +count+ " skill you want to delete from the above");
						Set<String> skilllist=new HashSet<String>();
						String skill;
						for(int i=1;i<=count;i++)
						{
							
							skill=scanner.next();
							
						if(!(retSkills.contains(skill.toUpperCase())))
							{
							//System.out.println("Entered skill is not there enter another");
								throw new SkillNotMatchedException("Entered skill is not there enter another");
							}
						else
							skilllist.add(skill.toUpperCase());
						}
						ICrudOperation iCrudOperation =new TrainerManagementDaoImpl();
						iCrudOperation.trainerSkillDeletion(currentTrainer,skilllist);
				}
						
			}
			
			}
		return false;
	}

	@Override
	public Trainer getTrainerDetails(Trainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashSet<Trainer> getAllTrainers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}


}