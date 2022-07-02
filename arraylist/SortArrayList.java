package arraylist;
import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter five numbers:");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			list.add(input.nextInt());
		}
		sort(list);
		System.out.println(list);//可以将list中存贮的对象的值直接打印出来
		input.close();
	}
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
}
