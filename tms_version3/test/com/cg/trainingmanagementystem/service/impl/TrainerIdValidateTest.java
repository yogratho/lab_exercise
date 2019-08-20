package com.cg.trainingmanagementystem.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cg.trainingmanagementystem.exception.InvalidUserIdException;
import com.cg.trainingmanagementystem.utility.TrainerCredentialValidation;

class TrainerIdValidateTest {


	@Test
	void trainerIdValidationWithValidInputTest() throws InvalidUserIdException {
		boolean actual=TrainerCredentialValidation.trainerIdValidate("180035IN");
		assertEquals(true, actual);
	
	}
	@Test()
	void trainerIdValidationWithWrongInputTest() throws InvalidUserIdException
	{
//		boolean actual=TrainerCredentialValidation.trainerIdValidate("18@#55IN");
//		assertNotEquals(false, actual);
		 Assertions.assertThrows(InvalidUserIdException.class, () -> {
			 TrainerCredentialValidation.trainerIdValidate("18@#55IN");

		    });
		
	}
	@Test
	void trainerIdLengthTest() throws InvalidUserIdException {
//		boolean actual=TrainerCredentialValidation.trainerIdValidate("181035IN");
//		assertEquals(false, actual);
		Assertions.assertThrows(InvalidUserIdException.class, () -> {
			 TrainerCredentialValidation.trainerIdValidate("11111111");

		    });
	
	}
	@Test
	void trainerIdSpecialCharTest() throws InvalidUserIdException {
//		boolean actual=TrainerCredentialValidation.trainerIdValidate("18103@IN");
//		assertEquals(true, actual);
		Assertions.assertThrows(InvalidUserIdException.class, () -> {
			 TrainerCredentialValidation.trainerIdValidate("111111@@@###");

		    });
		
	}
}
