package inputAndOuput;
import java.util.Scanner;
import java.net.*;
public class ReadWebResource {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("please enter a url:");
		Scanner input = new Scanner(System.in);
		try{
			URL url = new URL(input.nextLine());
			Scanner input1 = new Scanner(url.openStream());
			int count = 0;
			while(input1.hasNext()) {
				
				String str = input1.next();
				count += str.length();
				
			}
			System.out.println("the size of this website is:"+ count);
		}
		catch(java.net.MalformedURLException ex){
			System.out.println("invalid url or file does not exist");
		}
		input.close();
	}

}
