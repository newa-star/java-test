package hello;
import java.util.Scanner;
public class SumAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a number between 1-999:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		int digit1 = a % 10;
		if(a - 10 < 0) {
			System.out.println("the sum of all digits:" + digit1);
		}
		else {  int b = (int)a / 10;
				int digit2 = b % 10;
			    if (b - 10 < 0){
				   System.out.println("the sum of all digits:" + (digit1 + digit2));
			   }
			    else { int c = (int)b / 10;
			    	   int digit3 = c % 10;
			    	   System.out.println("the sum of all digits:" + (digit1 + digit2 + digit3));
			    }
	}
	}
}
