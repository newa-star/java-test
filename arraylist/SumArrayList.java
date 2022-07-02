package arraylist;
import java.util.*;
public class SumArrayList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter five numbers:");
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		int n = 0;
		while(n<5) {
			list.add(input.nextDouble());
			n++;
		}
		System.out.println("the sum of the arraylist is:"+SumArrayList.sum(list));
		input.close();
	}
	public static double sum(ArrayList<Double> list) {
		int sum = 0;
		for(int i = 0;i<list.size();i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
