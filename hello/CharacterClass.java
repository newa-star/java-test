package hello;
import java.util.Scanner;
public class CharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a letter grade:");
		Scanner input = new Scanner(System.in);
		String grade = input.nextLine(); 
		char letter = grade.charAt(0);
		switch(letter) {
			case 'A':System.out.println("4");break;
			case 'B':System.out.println("3");break;
			case 'C':System.out.println("2");break;
			case 'D':System.out.println("1"); break;
			case 'F':System.out.println("0");break;
			default:System.out.println(letter + " is an invalid grade");break;
	}
		input.close();
	}
}
	