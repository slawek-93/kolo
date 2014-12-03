package kolo;

public class Bankworker extends User {

	private String pesel;
	private String office;
	
		public Bankworker(String name, String surname, int age, String pesel,
			String office) {
		super(name, surname, age);
		this.pesel = pesel;
		this.office = office;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	
	


}
