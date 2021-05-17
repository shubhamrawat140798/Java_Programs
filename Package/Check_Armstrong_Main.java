package pack2;
import pack1.Test1;
import java.util.Scanner;
 class Test2{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a no. : ");
		int a = O.nextInt();
		Test1 b = new Test1();
		b.Checkarmstrong(a);
	} 
}
