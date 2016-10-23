package com.orangeandbronze.enlistment;

import static org.junit.Assert.*;

import org.junit.Test;
import static com.orangeandbronze.enlistment.Days.*;
import static com.orangeandbronze.enlistment.Period.*;

public class SectionTest {

	@Test
	public void idIsAlphaNumeric() {
		Subject subject = new Subject("ABC123", Courses.English);
		Section section = new Section("ABC123", new Schedule(Days.MTH, Period.P0830),new Room("RM1"),subject);
		assertNotNull(section);		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void idHasSpecialCharacters(){
		Subject subject = new Subject("ABC123", Courses.English);
		Section section = new Section("ABC123!@#", new Schedule(Days.MTH, Period.P0830),new Room("RM1"),subject);
//		assert
	}
	
}
