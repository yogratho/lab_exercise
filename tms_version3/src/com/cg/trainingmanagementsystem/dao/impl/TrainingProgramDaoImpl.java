package com.cg.trainingmanagementsystem.dao.impl; 
import java.util.*;

import com.cg.trainingmanagementsystem.dao.ICrudOperation;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.entity.TrainingProgram;

/**
 * 
 */
public class TrainingProgramDaoImpl implements ICrudOperation<TrainingProgram> {

	@Override
	public boolean create(TrainingProgram o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(TrainingProgram o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TrainingProgram retrieve(TrainingProgram o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(TrainingProgram o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashSet<TrainingProgram> getAllTrainers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trainerSkillDeletion(Trainer trainer, Set<String> skilllist) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void trainerSkillAddition(Trainer trainer,Set<String> skilllist)
	{
		
	}

	


}