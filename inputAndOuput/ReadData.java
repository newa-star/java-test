package inputAndOuput;
import java.util.Scanner;
import java.io.*; 
public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(TestFile.file);
		while(input.hasNext()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}

}
