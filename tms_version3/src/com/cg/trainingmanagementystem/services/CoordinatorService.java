
package com.cg.trainingmanagementystem.services;

import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.IFeedbackOperation;
import com.cg.trainingmanagementystem.service.ITrainingProgramOperation;
import com.cg.trainingmanagementystem.service.entity.Course;
import com.cg.trainingmanagementystem.service.entity.Feedback;
import com.cg.trainingmanagementystem.service.entity.Student;
import com.cg.trainingmanagementystem.service.entity.TrainingProgram;

public class CoordinatorService {

	public CoordinatorService() {
	}

	private ICourseOperation courseOperation;

	private ITrainingProgramOperation trainingProgramOperation;

	private IFeedbackOperation feedbackOperation;

	private Feedback feedback;

	private TrainingProgram trainingProgram;

	private Course course;

	public boolean enrollPariticpant(Student student, TrainingProgram trainingProgram) {
		// TODO implement here
		return false;
	}

	public boolean validateCourseAddition(Course course) {
		// TODO implement here
		return false;
	}

	private String generateParticipantId() {
		// TODO implement here
		return "";
	}

}