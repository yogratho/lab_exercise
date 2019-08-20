package com.cg.trainingmanagementsystem.collection;

import java.util.HashSet;
import java.util.Set;

import com.cg.trainingmanagementystem.service.entity.Trainer;

public class TrainerStaticDatabase {
static public Set<String> skillTest;
static public Set<Trainer> trainer=new HashSet<Trainer>();
	public static void initiateTrainerDatabase()
	{	
		 //public static Set<Trainer> trainer=new HashSet<Trainer>();
		Set<String>  setOne=new HashSet<String>();
		setOne.add("JAVA");
		setOne.add("C");
		setOne.add("PYTHON");
		skillTest=setOne;
		trainer.add(new Trainer("180035IN", "Yogendra", "Jhotwara Jaipur", setOne));
		Set<String> setTwo=new HashSet<String>();
		setTwo.add("ADVANCEJ");
		setTwo.add("ANDROID");
		trainer.add(new Trainer("180231IN", "Yogendra Sharma", "Kanta Jaipur", setTwo));
		Set<String> setThree=new HashSet<String>();
		setThree.add("C");
		setThree.add("C++");
		setThree.add("KOTLIN");
		trainer.add(new Trainer("181031IN", "Vishal M", "AP", setThree));

	}
	
	
	

}
