package arraylist;
import java.util.*;
public class RemoveReplicate {
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i=9;i>0;i--) {
			for(int j=i-1;j>0;j--) {
			if(list.get(i)==list.get(j)) {
				list.remove(i);
				break;}
		}
		}
		System.out.print("the distinct numbers are: ");
		for(int i=0;i<list.size();i++) {
			if(list.get(i) != null )
					System.out.print(list.get(i)+"\s");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ten integers:");
		Scanner input = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		input.close();
	}

}
