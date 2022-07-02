package hello;
import java.util.Scanner;
public class As2Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter an ASC2 code:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if((number > 127) || (number < 0))
			System.out.println("please enter a number from 0 to 127");
		else System.out.println((char)(number));
		input.close();
	}

}
