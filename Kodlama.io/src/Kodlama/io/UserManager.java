package Kodlama.io;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " eklendi.");
	}
	
	public void delete(User user) {
	    System.out.println(user.getFirstName()+ " silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " güncellendi");
	}
	
}
