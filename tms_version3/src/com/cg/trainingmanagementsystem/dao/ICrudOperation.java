package com.cg.trainingmanagementsystem.dao;
import java.util.*;

import com.cg.trainingmanagementystem.service.entity.Trainer;

/**
 * 
 */
public interface ICrudOperation<T> {

	/**
	 * 
	 */
	public boolean create(T o);

	/**
	 * 
	 */
	public boolean update(T o);

	/**
	 * 
	 */
	public T retrieve(T o);

	/**
	 * 
	 */
	public boolean delete(T o);

	/**
	 * 
	 */
	public HashSet<T> getAllTrainers();
	public void trainerSkillDeletion(Trainer trainer,Set<String>skilllist);
	public void trainerSkillAddition(Trainer trainer,Set<String> skilllist);

}