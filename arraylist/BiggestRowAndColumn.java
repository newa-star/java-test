package arraylist;
import java.util.*;
public class BiggestRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the row and column of the matrix:");
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int n = input.nextInt();
		input.close();
		int [][] array = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j] = random.nextInt(2);//随机生成0或1的数
			}
		
		}
		System.out.println("the random array is:");
		for(int i = 0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.print("\n");
		}//打印数组
		
		
		
		
		int[] rowSum = new int[n];
		int maxRowIndex = 0;//最多1的行的下标
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				rowSum[i] += array[i][j];
			}
			if(rowSum[i] > rowSum[maxRowIndex])
				maxRowIndex = i;
		}
		ArrayList<Integer> rowIndex = new ArrayList<Integer>();
		rowIndex.add(maxRowIndex);
		System.out.println("the largest row index:"+rowIndex.get(0));
		
		
		
		int[] columnSum = new int[n];
		int maxColumnIndex = 0;//最多1的列的下标
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				columnSum[i] += array[j][i];
			}
			if(columnSum[i] > columnSum[maxColumnIndex])
				maxColumnIndex = i;
		}
		ArrayList<Integer> columnIndex = new ArrayList<Integer>();
		columnIndex.add(maxColumnIndex);
		System.out.println("the largest column index:"+columnIndex.get(0));
	}

}
