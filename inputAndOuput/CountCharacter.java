package inputAndOuput;
import java.io.*;
import java.util.*;
public class CountCharacter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("please enter a text file name:");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		input.close();
		String path = "C:\\Users\\a0987\\Desktop\\testfile\\"+filename;
		try {
			new CountCharacter().countLetter(path);
		}
		catch(FileNotFoundException ex) {
			if(!(new File(path).exists()))
				System.out.println("file does not exist");
			else if(new File(path).isDirectory())
				System.out.println("it is a directory not a text file");
			
		}
	}
	public void countLetter(String path) throws FileNotFoundException {
		
		File file = new File(path);
		Scanner count = new Scanner(file);
		ArrayList <String> list = new ArrayList<String>(); 
		int[] numberOfUpcaseletter = new int[26];
		int[] numberOfLowcaseletter = new int[26];
		int n = 0;//字母出现次数的数组的下标
		while(count.hasNext()) {
			list.add(count.nextLine());
		}
		for(char m = 'A';m<'Z';m++,n++) {
			for(int i=0;i<list.size();i++) {
				for(int j=0;j<list.get(i).length();j++) {
					if(list.get(i).charAt(j) == m)
						numberOfUpcaseletter[n] += 1;
				}
			}
		}//计算所有大写字母的出现次数
		n = 0;//下标归0
		for(char m = 'a';m<'z';m++,n++) {
			for(int i=0;i<list.size();i++) {
				for(int j=0;j<list.get(i).length();j++) {
					if(list.get(i).charAt(j) == m)
						numberOfLowcaseletter[n] += 1;
				}
			}
		}//计算所有小写字母的出现次数
		char upperLetter = 'A';
		for(int e:numberOfUpcaseletter) {
			System.out.println("the number of "+upperLetter+" is "+e);
			upperLetter++;
		}
		char lowerLetter = 'a';
		for(int e:numberOfLowcaseletter) {
			System.out.println("the number of "+lowerLetter+" is "+e);
			lowerLetter++;
		}
		count.close();
	}
	
}
