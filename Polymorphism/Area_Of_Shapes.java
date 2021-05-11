import java.util.Scanner;
class Area_poly{
	static void area(int side){
		System.out.println(" Area of square side "+side+" is "+(side*side));
	}
	static void area(int length, int breadth){
		System.out.println(" Area of rectangle of length : "+length+" and breadth : "+breadth+" is : "+(length*breadth));
	}
	static void area(float radius){
		System.out.println(" Area of circle of radius : "+radius+" is : "+(radius*radius*3.14));
	}
		
	
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Choices \n 1. Area of Square \n 2. Area of rectangle \n 3. Area of Circle \n Enter your choice : ");
		int a = O.nextInt();
		int side,length,breadth;
		float radius;
		switch(a){
			case 1:
				System.out.print("\n Enter side of square : ");
				side = O.nextInt();
				area(side);
				break;
				
			case 2:
				System.out.print("\n Enter length of rectangle : ");
				length = O.nextInt();
				System.out.print("\n Enter breadth of rectangle : ");
				breadth = O.nextInt();
				area(length,breadth);
				break;
				
			case 3:
				System.out.print("\n Enter radius of cicle : ");
				radius = O.nextFloat();
				area(radius);
				break;
				
			default:
				System.out.print("\n Invalid Input");
			
		}
		
	}
}
