package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {9,6,2,8,1,3,5};
		int length = array.length;
		for(int i= 0;i<length-1;i++) {
			int currentMin = array[i];
			int indexOfMin = i;
			for(int j=i+1;j<length;j++) {
				if(array[j]<currentMin) {
					currentMin = array[j];
					indexOfMin = j;
				}
				if(array[i]!= currentMin) {
					array[indexOfMin] = array[i];
					array[i] = currentMin;
					}
			}
		}
		 for(int k = 0;k<length;k++) {
			System.out.printf("%4d", array[k]);
		}
	}

}
