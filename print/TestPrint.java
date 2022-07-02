package print;
import java.util.Scanner;
public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1,j =1;
		System.out.println("enter a number:");
		Scanner input =  new Scanner(System.in);
		int n = input.nextInt();
		while(i < n) {
			
			System.out.println("\n"+i);
			i++;
		}
		while(j<n) {
			System.out.printf("%4d", j);
			j++;
		}
	}

}
