package person;

public class Student extends Person {
	private String grade;
	final String GRADE1 = "freshman"; 
	final String GRADE2 = "junior";
	final String GRADE3 = "senior";
	final String GRADE4 = "graduate";
	
	public Student() {
		
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade1() {
		this.grade = GRADE1;
	}
	public void setGrade2() {
		this.grade = GRADE2;
	}
	public void setGrade3() {
		this.grade = GRADE3;
	}
	public void setGrade4() {
		this.grade = GRADE4;
	}
	
	public String toString() {
		String str = "Student"+" "+super.getName();
		return str;
	}
}
