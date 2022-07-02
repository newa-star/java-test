package inputAndOuput;
import java.util.*;
import java.net.*;
import java.io.*;
public class GetWebsource {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<String>();
		try {
		URL url = new URL("https://wenku.baidu.com/view/335d5bb8ac02de80d4d8d15abe23482fb4da02ae.html");
		Scanner input = new Scanner(url.openStream());
		while(input.hasNext()) {
			list.add(input.nextLine());
		}
		input.close();
		File file =new File("C:\\Users\\a0987\\Desktop\\testfile\\gardening.txt");
		PrintWriter output = new PrintWriter(file);
		for(String str:list) {
			output.println(str);
		}
		output.close();
		}
		catch(java.net.MalformedURLException ex) {
			System.out.println("invalid url or file does not exist");
		}
		
		}
	}


