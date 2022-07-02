package hello;

public class RateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double interest = 0.00417;
		double balance = 100;
		for (int i =0;i<6;i++) {
			balance = Math.pow( balance* (1 + interest),1);
			System.out.println("the balance of you bank account is :"+balance);
			balance += 100;
		}
	}

}
