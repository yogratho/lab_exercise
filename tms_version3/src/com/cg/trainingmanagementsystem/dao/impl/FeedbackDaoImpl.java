package com.cg.trainingmanagementsystem.dao.impl;
import java.util.*;

import com.cg.trainingmanagementsystem.dao.ICrudOperation;
import com.cg.trainingmanagementystem.service.entity.Feedback;
import com.cg.trainingmanagementystem.service.entity.Trainer;

/**
 * 
 */
public class FeedbackDaoImpl implements ICrudOperation<Feedback> {

	@Override
	public boolean create(Feedback o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Feedback o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Feedback retrieve(Feedback o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Feedback o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashSet<Feedback> getAllTrainers() {
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