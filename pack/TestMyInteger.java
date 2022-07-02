package pack;
import java.util.Scanner;
public class TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a integer:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		MyInteger integer = new MyInteger(a);
		System.out.println("the value of this integer is:"+integer.getValue());
		System.out.println("is this integer a even number:"+integer.isEven());
		System.out.println("is this integer a odd number:"+integer.isOdd());
		System.out.println("is this integer a prime number:"+integer.isPrime());
		System.out.println("is -2 a even number:"+integer.isEven(-2));
		System.out.println("is 5 a odd number:"+integer.isOdd(5));
		System.out.println("is 2 a prime number:"+integer.isPrime(2));
		char[] character = {'1','2','3'};
		String string = "123";
		System.out.println("the value of this char array is:"+MyInteger.ParseInt(character));
		System.out.println("the value of this string is:"+MyInteger.ParseInt(string));
	}

}
