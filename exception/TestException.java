package exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TestException {

	public static void main(String[] args)  throws InputMismatchException{
		// TODO Auto-generated method stub
		System.out.println("please enter two integers:");
		Scanner input = new Scanner(System.in);
		try {
			int n = input.nextInt();
			int m = input.nextInt();
			System.out.println(m+n);
		}
		catch(InputMismatchException ex) {
			System.out.println("incorrect input.m or n is not an integer,please try again");
		}
		input.close();
	}
		
}
