import java.util.Scanner; // to import scanner class

class Circle_area{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in); // Create Scanner oject
		System.out.print("Enter radius of the circle: ");
		double area;
		double radius = myObj.nextDouble(); // Read user input
		area = 3.14*(radius*radius);
		System.out.println(" area of the enter radius circle is : " + area);
	}
	
}
