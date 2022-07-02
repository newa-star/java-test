package inputAndOuput;

import java.io.File;

public class TestFile {
	public static File file = new File("C:\\Users\\a0987\\Desktop\\testfile\\file.txt");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "C:\\Users\\a0987\\Desktop\\testfile\\file.txt";
		File file = new File(str);
		boolean isExist = file.exists();
		System.out.println(isExist);
		System.out.println(file.isDirectory());
	}

}
