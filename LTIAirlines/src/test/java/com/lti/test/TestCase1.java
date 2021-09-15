package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;
import com.lti.model.Flight;
public class TestCase1 {

	@Test
//	public void testAdd() {
//		int num1=20,num2=10;
////		assertEquals(20, Main.add(num1, num2));
//		
////		assertEquals(true,Main.compare(num1, num2));
//		
//		assertTrue(Main.compare(num1, num2));
//		
//		assertFalse(Main.compare(num1, num2));
//	}
	
	public void testObjects() {
		Flight f1=new Flight(1001,"chennai","bangalore");
//		Flight f2=new Flight(1001,"chennai","bangalore");
//		Flight f2=f1;
		Flight f3=null;
//		assertEquals("objects are not equal",f1, f2);
//		assertEquals(f1, f2);
//		assertSame(f1,f2);
		assertNotNull(f1);

	}

}
