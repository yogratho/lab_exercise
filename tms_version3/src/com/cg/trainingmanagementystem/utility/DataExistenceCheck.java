package com.cg.trainingmanagementystem.utility;

import java.util.Iterator;
import java.util.Set;

import com.cg.trainingmanagementsystem.collection.TrainerStaticDatabase;
import com.cg.trainingmanagementystem.service.entity.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;

public class DataExistenceCheck {
	
	public static boolean DataBaseExistenceCheck(String trainerId,String skill)
	{
		
		Set<Trainer> trainer;
		trainer=TrainerStaticDatabase.trainer;
		Iterator value = trainer.iterator();
		boolean response=false;
		while(value.hasNext())
		{
			Trainer tt=(Trainer)value.next();
			if(tt.getTrainerId().equalsIgnoreCase(trainerId))
			{
//				Set<String> retSkills=tt.getSkill();
				for(Skills skillEnum: Skills.values())
				{
				if(skillEnum.name().equalsIgnoreCase(skill))
				{response=true;
				break;
				}
				}
				break;
				}
		}
return response;
}
}
