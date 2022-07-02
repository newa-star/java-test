package date;
import java.util.Date;
public class TestDate {
	public static String showDate(){
		Date date = new Date(122,3,27); //（注意年份要加上1900，这样才是日期对象date所代表的年份（注意月份要加1，这样才是日期对象date所代表的月份)				*/
		String show = date.toString();
		return show;
	}
	public static void main(String[] args) {
		String showCurrentDate = TestDate.showDate();
		System.out.print("the current date is :" + showCurrentDate);
	}
}
