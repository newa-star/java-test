package hello;
import java.util.Scanner;
public class ArrayConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter 5 characters:");
		Scanner input = new Scanner(System.in);
		String charin = input.nextLine();
		char [] chars = new char[5];
		for(int i = 0;i<5;i++) {
			chars[i] = charin.charAt(i);
		}
		
		String str = String.valueOf(chars);
		System.out.println("the string is:"+ str);
		char [] letter = str.toCharArray();
		System.out.println("the char array is:");
		for(int i =0;i<letter.length;i++)
			System.out.println(letter[i]);
		input.close();
	}

}
