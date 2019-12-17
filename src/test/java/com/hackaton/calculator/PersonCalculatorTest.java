package com.hackaton.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackaton.model.PersonModel;

public class PersonCalculatorTest {

	@Test
	public void testChildrenSex() {
		PersonModel person = new PersonModel();
		person.setSex("Female");
		person.setAge(24);
		
		PersonCalculator calc = new PersonCalculator();
		
		calc.doOperation(person);
		
		assertEquals(person.getModel().getTitle(), "Females, Birth – 36 Months");
	}

}
