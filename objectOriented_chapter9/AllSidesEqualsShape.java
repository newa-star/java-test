package objectOriented_chapter9;

public class AllSidesEqualsShape {
	private int n =3;//边数。默认为3
	private double side = 1;//边长。默认为1
	private double x = 0;//中心横坐标，默认为0
	private double y = 0;//中心纵坐标，默认为0
	static final double PI = 3.14;
	AllSidesEqualsShape(){
		
	}
	AllSidesEqualsShape(int n,double side){
		this.n = n;
		this.side = side;
	}
	AllSidesEqualsShape(int n,double side,double x,double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getPerimeter() {
		double perimeter;
		perimeter = side*n;
		return perimeter;
	}
	public double getArea() {
		
		double area;
		area = n*side*side/(4*Math.tan(PI/n));
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSidesEqualsShape shape1 = new AllSidesEqualsShape();
		System.out.println("the perimeter of shape1 is:"+ shape1.getPerimeter());
		System.out.println("the area of shape1 is:"+ shape1.getArea());
		AllSidesEqualsShape shape2 = new AllSidesEqualsShape(6,4);
		System.out.println("the perimeter of shape2 is:"+ shape2.getPerimeter());
		System.out.println("the area of shape2 is:"+ shape2.getArea());
		AllSidesEqualsShape shape3 = new AllSidesEqualsShape(10,4,5.6,7.8);
		System.out.println("the perimeter of shape3 is:"+ shape3.getPerimeter());
		System.out.println("the area of shape3 is:"+ shape3.getArea());
	}

}
