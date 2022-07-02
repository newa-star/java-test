package date;
import java.util.GregorianCalendar;
public class GregorianCalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar date = new GregorianCalendar();
		int year = date.get(GregorianCalendar.YEAR);
		int month = date.get(GregorianCalendar.MONTH);
		int day = date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.print("current date is:"+year+"\s");
		System.out.print(month+"\s");
		System.out.print(day+"\s\n");
		showDate(date);
	}
	public  static void showDate(GregorianCalendar date) {
		date.setTimeInMillis(1234567898765L);
		int year = date.get(GregorianCalendar.YEAR);
		int month = date.get(GregorianCalendar.MONTH);
		int day = date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.print("the set date is:"+year+"\s");
		System.out.print(month+"\s");
		System.out.print(day+"\s");
	}

}
