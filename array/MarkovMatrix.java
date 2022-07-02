package array;
import java.util.Scanner;
public class MarkovMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a 3-by-3 matrix row by row");
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];//定义数组
		for(int i=0;i<3;i++) {
			for(int j =0;j<3;j++) {
				matrix[i][j] = input.nextDouble();
			}
			
		}
		boolean isMarkov = isMarkovMatrix(matrix);
		if(isMarkov) 
			System.out.println("It is a Markov matrix");
		else 
			System.out.println("It is not a Markov matrix");
		input.close();
	}
	public static boolean isMarkovMatrix(double [][] m){
		boolean islength = true;
		boolean isSum = true;
		double columnSum = 0.0;//注意要声明为Double型变量，否则此程序会出错
		for(int i = 0;i<3;i++) {
		if( m.length == m[i].length ) continue;
		else islength = false;break;
		}//判断是否n*n矩阵
		for(int i=0;i<3;) {
			
			for(int j=0;j<3;j++) {
				columnSum += m[j][i];
			}
			if(columnSum == 1.0)  {
				columnSum = 0.0;}
			else 
				isSum = false;break;
		}//判断每列的和是否为1
		return (islength&&isSum); 
	
	}
}
