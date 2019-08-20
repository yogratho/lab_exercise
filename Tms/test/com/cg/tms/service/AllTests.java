package com.cg.tms.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FeedbackTest.class, IdValidationTest.class, TrainerSkillsOperationImplTest.class })
public class AllTests {
 @Test
 public void adminIdLengthTest()
 {
	 fail();
 }
}
