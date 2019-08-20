package com.cg.trainingmanagementsystem.dao.impl;

import java.util.*;

import com.cg.trainingmanagementsystem.dao.ICrudOperation;
import com.cg.trainingmanagementystem.service.entity.Trainer;

/**
 * 
 */
public class TrainerManagementDaoImpl implements ICrudOperation<Trainer> {
public static Set<String> skilltest;
public static Set<String> skilldel;

	@Override
	public boolean create(Trainer o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Trainer o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainer retrieve(Trainer o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Trainer o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashSet<Trainer> getAllTrainers() {
		// TODO Auto-generated method stub
		return null;
	}
	//public class TrainerManagementDaoImpl implements ICrudOperation<Trainer> {
	@Override
	public void trainerSkillDeletion(Trainer trainer, Set<String> skilllist) {
		// TODO Auto-generated method stub
			
		Set<String> updatedSkill=trainer.getSkill();
		updatedSkill.removeAll(skilllist);
//		if(updatedSkill.isEmpty())
//			System.out.println("No Database for deletion of skills");
		System.out.println(trainer.getTrainerName()+" your skills after deletion operation are as listed below:");
		if(updatedSkill.isEmpty())
			System.out.println("Now you have no skills added in database");
		

		for (String s : updatedSkill)  
			System.out.println(s);
		System.out.println("Deletion operation done Successfully");
		skilldel=updatedSkill;
		
	}
	@Override
	public void trainerSkillAddition(Trainer trainer,Set<String> skilllist)
	{
		
		Set<String> updatedSkill=trainer.getSkill();
		updatedSkill.addAll(skilllist);
		System.out.println(trainer.getTrainerName()+" your skills after Addition operation are as listed below:");
		for (String s : updatedSkill)  
			System.out.println(s);
		skilltest=updatedSkill;
		System.out.println("Addition operation done Successfully");
	}

}