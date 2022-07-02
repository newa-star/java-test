package inputAndOuput;
import java.io.*;
import java.util.*;
public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a directory:");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		if(new File(directory).exists())
			System.out.println("Directory already exists.");
		else createADirectory(directory);
		input.close();
	}
	public static void createADirectory(String directory){
		File file = new File(directory);
		if(file.mkdirs())
			System.out.println("Directory created successfully.");
	}
}
