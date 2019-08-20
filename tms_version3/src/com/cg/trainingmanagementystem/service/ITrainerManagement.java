package com.cg.trainingmanagementystem.service;

import java.util.*;

import com.cg.trainingmanagementystem.exception.InvalidUserIdException;
import com.cg.trainingmanagementystem.exception.NoSkillInDatabaseException;
import com.cg.trainingmanagementystem.exception.SkillNotMatchedException;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;

/**
 * 
 */
public interface ITrainerManagement {

	/**
	 * 
	 */
	public boolean addSkillsToTrainer( String trainerId, Set<String> skill) throws InvalidUserIdException;

	/**
	 * 
	 */
	public boolean delSkillsToTrainer( String trainerId, Set<String> skills)throws NoSkillInDatabaseException,SkillNotMatchedException;

	/**
	 * 
	 */
	public Trainer getTrainerDetails(Trainer trainer);

	/**
	 * 
	 */
	public HashSet<Trainer> getAllTrainers();

	/**
	 * 
	 */
	public boolean createTrainer(Trainer trainer);

}