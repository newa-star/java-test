package array;
import java.util.Scanner;
public class PrintDifferentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the first number of the array:");
		array[0] = input.nextInt();
		int currentIndex = 1;
		System.out.println("please enter the left 9 numbers of the array:");
		for(int i = 1;i<10;i++) {
			int temp = input.nextInt();//暂时存贮输入的数用于之后的比较
			for(int j =0;j<currentIndex;j++) {
				if(array[j]==temp)
					break;
				else if(j == currentIndex-1) {
					array[currentIndex] = temp;
					currentIndex += 1;
				}
//currentIndex代表现在需要赋值的数组元素下标，比较从array[0]-array[currentIndex-1]	的数组元素是否与temp相等				
			}
			
		}
		System.out.println("the array whose numbers are all different is: ");
		for(int i=0;i< currentIndex;i++) {
			System.out.print(array[i]+"\s");
		}
		input.close();
	}

}
