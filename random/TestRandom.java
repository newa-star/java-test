package random;
import java.util.Random;
public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random seed = new Random(1000);//新建一个对象，数字1000为构建数字生成器的初始数字
		for(int i=0;i<50;i++) {
			System.out.print(seed.nextInt(100)+"\s");
		}
	}

}
