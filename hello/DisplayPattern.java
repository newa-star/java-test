package hello;
import java.util.Scanner;
public class DisplayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		displayPattern(num);
	}
	public static void displayPattern(int n) {
		for(int i = 1;i <= n;i++) {
			for(int j = n;j > 0;j--) {
				if(j > i)
					System.out.print("\s\s");//第一个输出的空格取代本应输出的数字，第二个输出的空格代表间隔
				else
					System.out.print(j+"\s");
			}
			System.out.println("\n");
		}
	}
}
