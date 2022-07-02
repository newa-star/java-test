package array;
import java.util.Scanner;
public class NineCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number between 0 and 511:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();//获取输入的数字
		input.close();
		String string =  Integer.toBinaryString(n);//将输入的数字转成字符串
		int length = string.length();
		char [] str  =  new char[9];
		for(int i = 0;i<str.length-length;i++) {
			str[i] = '0';//根据字符串的长度，字符数组前面的位数值为‘0’
		}
		for(int i = str.length-length,j=0;i<9;i++,j++) {
			str[i] = string.charAt(j);
					}
		char[][] coin = new char[3][3];
		int m = 0;
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				coin[i][j] = str[m];
				m++;
			}
		}//将一维的字符数组的值赋给二维字符数组对应的位数
		char [][] showCoins = new char[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(coin[i][j] == '0')
						showCoins[i][j] = 'H';
				else if(coin[i][j] == '1')
					showCoins[i][j] = 'T';
			}
		}
		for(int i = 0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(showCoins[i][j]+"\s");
			}
			System.out.print("\n");
		}
	}
	

}
