package week3.day2.Assignment2.org.student;

import week3.day2.Assignment2.org.department.Department;

public class Student extends Department{

	public void studentName(String studName) {
		System.out.println("Student's Name: "+ studName);
	}
	
	public void studentDept(String studDept) {
		System.out.println("Student's Department: "+ studDept);
	}
	
	public void studentId(String id) {
		System.out.println("Student ID: "+ id);
	}
	
	public static void main(String[] args) {
		Student stud1 = new Student();
		
		stud1.studentName("Vimalan");
		stud1.studentId("20BAI1223");
		stud1.studentDept("AI & ML");
		
		// Multi level Inheritance 
		stud1.collegeName("VIT");
		stud1.collegeCode(183642);
		stud1.collegeRank(6);
		
		stud1.deptName("AI & ML");
	}
}
