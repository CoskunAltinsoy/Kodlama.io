package Kodlama.io;

public class Student extends User{
	int studentNumber;
	
	public Student() {
		
	}
	
	public Student(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
	    this.studentNumber = studentNumber;
	}

}
