package Kodlama.io;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getStudentNumber() + " . ��renci eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getStudentNumber() +" . ��renci silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.getStudentNumber() +" . ��renci g�ncellendi");
	}

}
