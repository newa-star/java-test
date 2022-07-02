import java.math.*;
public class Test {
    public static void main(String[] args) {

        //write your code here........
        double [] array = new double[10];
        double sum = 0;
        for(int i=0;i<10;i++){
            array[i] = Math.pow(10,i+1) - 1;
            sum += array[i];
        }
        System.out.println(sum);
    }
}