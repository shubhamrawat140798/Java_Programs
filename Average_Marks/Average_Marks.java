import java.util.Scanner;

class Average_marks{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter 5 subject marks");
		
		System.out.print("\n Enter marks in Enlish:  ");
		double eng = myObj.nextDouble();
		
		System.out.print("\n Enter marks in Maths:   ");
		double mat = myObj.nextDouble();
		
		System.out.print("\n Enter marks in Science: ");
		double sci = myObj.nextDouble();
		
		System.out.print("\n Enter marks in Hindi:   ");
		double hin = myObj.nextDouble();
		
		System.out.print("\n Enter marks in SST:     ");
		double sst = myObj.nextDouble();
		 
		System.out.println("\n Total average marks:     " + (eng + mat + sci + hin + sst )/5); 
	}
}
