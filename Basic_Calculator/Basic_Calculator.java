import java.util.Scanner;
class Arithematic_operation{
	public static void main(String args[])
	{
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter first no: ");
		double a = O.nextDouble();
		System.out.print("\n Enter second no: ");
		double b = O.nextDouble();
		System.out.print("\n Arithematic Operation Choice : \n 1. Add \n 2. Subtract \n 3. Divide \n 4. Multiply \n Your Choice: " );
		int ch = O.nextInt();
		double c;
		switch(ch){
			case 1:
				c = a+b;
				System.out.println(" Output of "+a+" + "+b+" = "+c);
				break;
				
			case 2:
				c = a-b;
				System.out.println(" Output of "+a+" - "+b+" = "+c);
				break;
				
			case 3:
				c = a/b;
				System.out.println(" Output of "+a+" / "+b+" = "+c);
				break;
				
			case 4:
				c = a*b;
				System.out.println(" Output of "+a+" X "+b+" = "+c);
				break;
				
			default:
				System.out.println(" Wrong Choice ");
				break;	
		}
	}
}
