package com.cisc181.core;

import static org.junit.Assert.*;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> staff1 = new ArrayList<Staff>();
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() throws PersonException {
		staff1.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1999, 1, 1), "Address", "1234567890",
				"Email", "officeHours", 1, 17000.10, new Date(2000, 2, 2), eTitle.MR));
		staff1.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1999, 1, 1), "Address", "1234567890",
				"Email", "officeHours", 1, 16000.20, new Date(1999, 1, 1), eTitle.MR));
		staff1.add(new Staff("FirstName", "MiddleName", "LastName",new Date(1999, 1, 1), "Address", "1234567890",
				"Email", "officeHours", 1, 15000.30, new Date(1999, 1, 1), eTitle.MR));
		staff1.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1999, 1, 1), "Address", "1234567890",
				"Email", "officeHours", 1, 14000.40, new Date(1999, 1, 1), eTitle.MR));
		staff1.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1999, 1, 1), "Address", "1234567890",
				"Email", "officeHours", 1, 13000.50, new Date(1999, 1, 1), eTitle.MR));
		}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		double a = (staff1.get(0).getSalary() + staff1.get(1).getSalary() + staff1.get(2).getSalary() + staff1.get(3).getSalary() + staff1.get(4).getSalary())/5.00;
		System.out.println(a);
		assertEquals(a,15000.3,0);
	
	}	
	

}
