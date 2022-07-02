package hello;

public class RandomDowncaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random() * 27) + 97;//a-z 的unicode 码对应十进制值是97到122
		char b = (char)a;
		System.out.println(b);
	}

}
