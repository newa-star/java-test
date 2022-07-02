package testinterface;

public class Square extends Object implements Colorable {

	@Override
	public  void howToColor() {
		// TODO Auto-generated method stub
		System.out.println("color all four sides.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] object = new Object[5];
		object[0] = new Square();
		int j = 1;
		while(j<5) {
			object[j]=new Object();
			j++;
		}
		for(int i=0;i<5;i++) {
			if(object[i] instanceof Square)
				((Square)object[i]).howToColor();
		}
	}

}
