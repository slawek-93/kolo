package kolo;

public class IT extends User {
	
	private String pesel;
	private String language;
		
	public IT(String name, String surname, int age, String pesel,
			String language) {
		super(name, surname, age);
		this.pesel = pesel;
		this.language = language;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	

}
