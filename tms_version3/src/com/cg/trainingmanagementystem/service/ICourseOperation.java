package com.cg.trainingmanagementystem.service;

import java.util.*;

import com.cg.trainingmanagementystem.service.entity.Course;

/**
 * 
 */
public interface ICourseOperation {

	/**
	 * 
	 */
	public boolean addCourse(Course course);

	/**
	 * 
	 */
	public boolean deleteCourse(Course course);

	/**
	 * 
	 */
	public boolean modifyCourse(Course course);

	/**
	 * 
	 */
	public HashSet<Course> getAllCourse();

	/**
	 * 
	 */
	public Course getCourseDetails();

}