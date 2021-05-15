import java.util.Scanner;

class PositiveNo{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a Number : ");
		double n1 = O.nextDouble();
		char ch;
		ch=(n1>=0)?'+':'-';
		System.out.print("\n Enter Number "+n1+" is "+ch+" ve Number \n");
	}
}
