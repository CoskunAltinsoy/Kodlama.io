package Kodlama.io;

public class InstructorManager extends UserManager{
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber()+" eklendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber() +" silindi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getInstructorNumber() + " güncellendi");
	}

}
