package person;

public class Staff extends Employee {
	private String title;
	
	public Staff() {
		
	}
	
	public  String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title =  title;
	}
	public String toString() {
		String str = "Staff"+" "+super.getName();
		return str;
	}
}
