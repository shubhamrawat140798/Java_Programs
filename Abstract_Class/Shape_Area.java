abstract class Shape{
	abstract void area();
}
class Rectangle extends Shape{
	int a,b;
	Rectangle(int x, int y){
		a = x;
		b = y;
	}
	void area(){
	
		System.out.println(" Area Rectangle : "+(a*b));
	}
