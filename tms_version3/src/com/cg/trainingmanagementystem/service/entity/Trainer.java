package com.cg.trainingmanagementystem.service.entity;

import java.util.HashSet;
import java.util.Set;

import com.cg.trainingmanagementystem.service.enumv.Skills;

public class Trainer {

	/**
	 * Default constructor
	 */
	public Trainer() {
	}

	public Trainer(String trainerId, String trainerName, String trainerAddress, Set<String> skill) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		TrainerAddress = trainerAddress;
		this.skill = skill;
	}

	/**
	 * 
	 */
	private String trainerId;

	/**
	 * 
	 */
	private String trainerName;

	/**
	 * 
	 */
	private String TrainerAddress;

	/**
	 * 
	 */
	//private Set<Skills> skills;
	private Set<String> skill;
	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerAddress() {
		return TrainerAddress;
	}

	public void setTrainerAddress(String trainerAddress) {
		TrainerAddress = trainerAddress;
	}

//	public Set<String> getSkills() {
//		Set<String> skilledSet;
//		return skilledSet;
//	}

	public void setSkills(Set<String> skills) {
		this.skill=skills;
		Set<String> skilledSet=new HashSet<String>();
		skilledSet.addAll(skills);
	}

	public Set<String> getSkill() {
		return skill;
	}

	public void setSkill(Set<String> skill) {
		this.skill = skill;
	}




}