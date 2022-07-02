package hello;
import java.util.Scanner;
public class CheckSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a SSN:");
		Scanner input = new Scanner(System.in);
		String SSNString = input.nextLine();
		if(SSNString.length() != 11) 
			System.out.println(SSNString + " is an invalid social security number");
		else if(  ( SSNString.charAt(3) != '_' ) || (SSNString.charAt(6) != '_') )
			System.out.println(SSNString  + " is an invalid social security number");
			else {
				 String string1 = SSNString.substring(0, 3);//返回原字符串0.1.2位字符组成的字符串子串
				 String string2 = SSNString.substring(4, 6);
				 String string3 = SSNString.substring(7, 11);
				 String checkString = string1 + string2 + string3;//9位数字
				 for(int i = 0;i<9;i++) {
					 char letter = checkString.charAt(i);
					 if( Character.isDigit(letter)  == false) {
						 System.out.println(SSNString + " is an invalid social security number");
					 	 break;}
					 else if(i == 8)
						 System.out.println(SSNString + " is a valid social security number");
				 }
			}
		input.close();
	}

}
