//WAP to find factorial of a number using recursion.
import java.util.Scanner;
class factorial_reccur{
	static int factorial(int n){
		if(n==1)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter an No. : ");
		int a = O.nextInt();
		System.out.println(" Factorial of "+a+" is : "+factorial(a));
	}
}
