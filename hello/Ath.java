package hello;
import java.util.Scanner;

public class Ath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		double area = Math.pow(radius,2)*PI;
		System.out.println(area);
		int a = 7 ;
		double b = a;
		float c = (float)b;
		System.out.print(c);
		input.close();
	}

}
