package print;
import java.util.Scanner;
public class TestPrint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Scanner input =  new Scanner(System.in);
		int n = input.nextInt();
		while(i < n) {
			System.out.printf("%4d",i);
			System.out.println(i);
			i++;
		}
	}

}
