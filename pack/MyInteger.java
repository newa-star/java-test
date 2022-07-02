package pack;

public class MyInteger {
	int value;
	
	public MyInteger(int a) {
		this.value = a;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return((value >= 0) && (value % 2 == 0));
	}
	
	public boolean isOdd() {
		return((value >= 0) && (value % 2 != 0));
	}
	
	public boolean isPrime() {
		boolean isPrime = false;
		if(value > 2) {
			for(int i=2;i<value;i++) {
				if(value%i != 0) 
					isPrime = true;
				else isPrime = false;break;
			}
		}
		else if(value == 2) isPrime = true;
			 else isPrime = false;
		return isPrime;
	}
	public boolean isEven(int n) {
		return((n >= 0) && (n % 2 == 0));
	}
	
	public boolean isOdd(int m) {
		return((m >= 0) && (m % 2 != 0));
	}
	
	public boolean isPrime(int x) {
		boolean isPrime = false;
		if(x > 2) {
			for(int i=2;i<x;i++) {
				if(x%i != 0) 
					isPrime = true;
				else isPrime = false;break;
			}
		}
		else if(x == 2) isPrime = true;
			 else isPrime = false;
		return isPrime;
	}
	
	public boolean isEven(MyInteger inte) {
		return((inte.getValue() >= 0) && (inte.getValue() % 2 == 0));
	}
	
	public boolean isOdd(MyInteger inte) {
		return((inte.getValue() >= 0) && (inte.getValue() % 2 != 0));
	}
	
	public boolean isPrime(MyInteger inte) {
		boolean isPrime = false;
		if(inte.getValue()>2){
			for(int i=2;i<inte.getValue();i++) {
				if(inte.getValue()%i != 0) 
					isPrime = true;
				else isPrime = false;break;
			}
		}
		else if(inte.getValue() == 2) isPrime = true;
			else isPrime = false;
		return isPrime;
	}
	
	public static int ParseInt(char [] chars) {
		String str = String.valueOf(chars);
		int result = Integer.parseInt(str);
		return result;
	}
	
	public static int ParseInt(String strs) {
		int result = Integer.parseInt(strs);
		return  result;
	}
}
