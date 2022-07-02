package hello;
import java.util.Scanner;
public class TelephoneNumberCorespondingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String allLetter = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("please enter a character:");
		Scanner input = new Scanner(System.in);
		String letter = input.nextLine();
		letter = letter.toLowerCase();
		if(letter.length() > 1 )
			System.out.println("please enter just one character");
		else {
			char character = letter.charAt(0);
			int digit  = allLetter.indexOf(character);
			if(digit == -1) 
				System.out.println(character + " is an invalid character");
			else if((digit >= 0) && (digit <= 2))
				System.out.println("The corresponding number is: 2");
			else if((digit >= 3) && (digit <= 5))
				System.out.println("The corresponding number is: 3");
				else if((digit >= 6) && (digit <= 8))
					System.out.println("The corresponding number is: 4");
					else if((digit >= 9) && (digit <= 11))
						System.out.println("The corresponding number is: 5");
						else if((digit >= 12) && (digit <= 14))
							System.out.println("The corresponding number is: 6");
							else if((digit >= 15) && (digit <= 18))
								System.out.println("The corresponding number is: 7");
							else if((digit >= 19) && (digit <= 21))
								System.out.println("The corresponding number is: 8");
								else if((digit >= 22) && (digit <= 25))
									System.out.println("The corresponding number is: 9");
	}
		input.close();
	}
	
}
