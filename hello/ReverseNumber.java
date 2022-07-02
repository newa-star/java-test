package hello;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a integer");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		reverse(num);
	}
	public static void reverse(int number) {
		String str = Integer.toString(number);
		String reverseString = "";
		int len = str.length();
		for(int i = 0;i < len;i++) {
			char letter = str.charAt(len-1-i);
			reverseString += letter ;
		}
		String result = reverseString.trim();
		System.out.println(result);
	}
}
