package com.cg.trainingmanagementsystem.dao.impl;
import java.util.*;

import com.cg.trainingmanagementsystem.dao.ICrudOperation;
import com.cg.trainingmanagementystem.service.entity.Course;
import com.cg.trainingmanagementystem.service.entity.Trainer;

/**
 * 
 */
public class CourseOperationDaoImpl implements ICrudOperation<Course> {

	@Override
	public boolean create(Course o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Course o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Course retrieve(Course o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Course o) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public HashSet<Course> getAllTrainers() {
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