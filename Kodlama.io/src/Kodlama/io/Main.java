package Kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		User instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setSurName("Demirog");
		instructor.setPhoneNumber("0123456789");
		instructor.setEmail("engin@gmail.com");
		instructor.setNationalIdentity("01234545319");
		
		User student = new Student();
		student.setId(2);
		student.setFirstName("Coskun");
		student.setSurName("Altınsoy");
		student.setPhoneNumber("980786756");
		student.setEmail("coskun@outlook.com");
		student.setNationalIdentity("0021142123");
				
		UserManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
		UserManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		
	}

}
