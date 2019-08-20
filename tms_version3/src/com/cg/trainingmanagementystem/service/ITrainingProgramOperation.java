package com.cg.trainingmanagementystem.service;



import com.cg.trainingmanagementystem.service.entity.TrainingProgram;

/**
 * 
 */
public interface ITrainingProgramOperation {

	/**
	 * 
	 */
	public boolean createProgram(TrainingProgram trainingProgram);

	/**
	 * 
	 */
	public boolean deleteTrainingProgram(TrainingProgram trainingProgram);

	/**
	 * 
	 */
	public boolean modifyTrainingProgram(TrainingProgram trainingProgram);

}