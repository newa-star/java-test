package person;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Judy");
		Person student = new Student();
		student.setName("Tom");
		Person employee = new Employee();
		employee.setName("Thoma");
		Person faculty = new Faculty();
		faculty.setName("simon");
		Person staff = new Staff();
		staff.setName("Robert");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
