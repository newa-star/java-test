package sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ins1 = {2,3,5,1,23,6,78,34};
		int[] ins2 = sort(ins1);
		System.out.println("after sorting,ins2 is:");
		for(int n: ins2){
			System.out.print(n+"\s");
		}
		System.out.println("\n"+"after sorting,ins1 is:");
		for(int n: ins1){
			System.out.print(n+"\s");
		}
	}
	public static int[] sort(int[] ins){
		
		for(int i=1; i<ins.length; i++){
			for(int j=i; j>0; j--){
				if(ins[j]<ins[j-1]){
					int temp = ins[j-1];
					ins[j-1] = ins[j];
					ins[j] = temp;
				}
			}
		}

		return ins;
	}

}
