package com.hackaton.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackaton.model.PersonModel;

public class PersonCalculatorTest {

	@Test
	public void testChildrenSex() {
		PersonModel person = new PersonModel();
		person.setSex("Female");
		person.setAge(24.5);
		
		PersonCalculator calc = new PersonCalculator();
		
		calc.createContent(person);
		
		assertEquals(person.getModel().getTitle(), "Females, Birth – 36 Months");
	}
	
	@Test
	public void testChildrenAgeAbove36Months() {
		PersonModel person = new PersonModel();
		person.setAge(100.5);
		person.setSex("Male");
		
		PersonCalculator calc = new PersonCalculator();
		
		calc.createContent(person);
		
		assertEquals(person.getModel().getTitle(), "Males, Ages 2-20 Years");
	}
	
	@Test
	public void testChildrenAgeCheck() {
		PersonModel person = new PersonModel();
		person.setAge(100.5);
		person.setSex("Male");
		person.setWeight(26.683);
		
		PersonCalculator calc = new PersonCalculator();
		
		calc.createContent(person);
		calc.checkRow(person);
		assertTrue(person.isWeightOk());
	}
	
	
	@Test
	public void testChildrenAgeCheckFalse() {
		PersonModel person = new PersonModel();
		person.setAge(100.5);
		person.setSex("Male");
		person.setWeight(19.95594);
		
		PersonCalculator calc = new PersonCalculator();
		
		calc.createContent(person);
		calc.checkRow(person);
		assertFalse(person.isWeightOk());
	}
}
