package kolo;

public class Teacher extends User {
	
	private String subject;
	
	
	public Teacher(String name, String surname, int age, String subject) {
		super(name, surname, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
