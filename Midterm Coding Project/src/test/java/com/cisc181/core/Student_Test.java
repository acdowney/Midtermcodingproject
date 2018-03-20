package com.cisc181.core;

import static org.junit.Assert.*;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> course = new ArrayList();
	static ArrayList<Semester> semester = new ArrayList();
	static ArrayList<Section> section = new ArrayList();
	static ArrayList<Student> student = new ArrayList();
	static ArrayList<Enrollment> enrollment = new ArrayList();
	@BeforeClass
	public static void setup() throws PersonException {
		Course Business = new Course(UUID.randomUUID(), "Bussiness", 5, eMajor.BUSINESS);
		course.add(Business);
		Course Chem = new Course(UUID.randomUUID(), "Chem", 6, eMajor.CHEM);
		course.add(Chem);
		Course Nursing = new Course(UUID.randomUUID(), "Nursing", 7, eMajor.NURSING);
		course.add(Nursing);
		Semester fall = new Semester(UUID.randomUUID(), new Date(1999, 8, 8), new Date(1999, 11, 11));
		semester.add(fall);
		Semester spring = new Semester(UUID.randomUUID(), new Date(1999, 1, 1), new Date(2005, 2, 2));
		semester.add(spring);
		section.add(new Section(Business.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 5));
		section.add(new Section(Chem.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 6));
		section.add(new Section(Nursing.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 7));
		section.add(new Section(Business.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 5));
		section.add(new Section(Chem.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 6));
		section.add(new Section(Nursing.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 7));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 1, 1), eMajor.BUSINESS,
					"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 2, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 3, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 4, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 5, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 6, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 7, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 8, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 9, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		student.add(new Student("Andrew", "Connor", "Downey",new Date(1999, 10, 1), eMajor.BUSINESS,
				"Walt", "1234567890", "Email"));
		
		
		
	}

	@Test
	public void test() {
		for(Student s:student) {
			for(Section i:section) {
				enrollment.add(new Enrollment(i.getSectionID(),s.getStudentID()));
			}
		}
		double sum = 0.0;
		for(int i = 0; i<enrollment.size(); i++) {
			enrollment.get(i).setGrade(3.0);
		}
		for(int k = 0; k<enrollment.size(); k++) {
			sum += enrollment.get(k).getGrade();
		}
		double avgGPA = sum/60.00;
		assertEquals(avgGPA,3.0,0.0);
	}
}