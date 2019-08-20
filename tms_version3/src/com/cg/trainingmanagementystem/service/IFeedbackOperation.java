package com.cg.trainingmanagementystem.service;

import com.cg.trainingmanagementystem.service.entity.Feedback;
import com.cg.trainingmanagementystem.service.entity.TrainingProgram;

public interface IFeedbackOperation {

	public Feedback viewFeedbackReport();

	public Feedback viewDefaulterList(TrainingProgram trainingProgram, Feedback feedback);

}