package array;
import java.util.Arrays;
public class CompareWorkingHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] workHours ={ 
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}
		};
		int [] weeklyWorkHours = new int[8];
		for(int i=0;i<8;i++) {
			for(int j=0;j<7;j++) {
			weeklyWorkHours[i] += workHours[i][j];
			}
		}
		 Arrays.sort(weeklyWorkHours);//升序排列
		 int[] reverse = new int[weeklyWorkHours.length];//反转为降序排列
		 for(int i = 0,j = weeklyWorkHours.length-1;i<weeklyWorkHours.length;i++,j--) {
			 reverse[j] = weeklyWorkHours[i];
		 }
		 for(int i = 0;i<reverse.length;i++)
			 System.out.println("the total hours in one week is:"+reverse[i]);
	}

}
