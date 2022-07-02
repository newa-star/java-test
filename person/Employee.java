package person;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double wage;
	private Date hiredDate;
	
	public Employee() {
		
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public Date getDate() {
		return hiredDate;
	}
	public void setDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}
	public String toString() {
		String str = "Employee"+" "+super.getName();
		return str;
	}
}
