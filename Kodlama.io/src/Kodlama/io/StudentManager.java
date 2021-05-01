package Kodlama.io;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getStudentNumber() + " . öğrenci eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getStudentNumber() +" . öğrenci silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.getStudentNumber() +" . öğrenci güncellendi");
	}

}
