package com.cg.tms.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.tms.service.IIdValidation;
import com.cg.tms.service.IdValidationImpl;

public class IdValidationTest {

		
		IIdValidation idValidate=new IdValidationImpl();
	

	@Test
	public void adminIdLengthTest() {
		assertEquals(true, idValidate.idValidation("123456_IN"));
	}
	

	@Test
	public void adminIdTypeMismatchTest()
{
		assertEquals(false, idValidate.idValidation("-123"));

	}
//	@Test
//	public void adminIdEmptyTest()
//	{
//		assertEquals("false", "");
//
//	}
//	@Test
//	public void trainerIdLengthTest()
//	{
//		assertEquals(8, "12345");
//
//	}
//	@Test
//	public void trainerIdTypeMismatchTest()
//	{
//		assertEquals("String", 12345);
//
//	}
//	@Test
//	public void trainerIdEmptyTest()
//	{
//		assertEquals("false", "");
//
//	}
//	@Test
//	public void courseIdLengthTest()
//	{
//		assertEquals(8, "12345");
//
//	}
//	@Test
//	public void courseIdTypeMismatchTest()
//	{
//		assertEquals("String", 12345);
//
//	}
//	@Test
//	public void courseIdEmptyTest()
//	{
//		assertEquals("true", "");
//
//	}
//	@Test
//	public void adminIdCountryCodeTest()
//	{
//		assertEquals("true", "IN");
//
//	}
//	@Test
//	public void adminIdCountryCodeLengthTest()
//	{
//		assertEquals(2, "IN");
//
//	}
//		
//	
//
}
