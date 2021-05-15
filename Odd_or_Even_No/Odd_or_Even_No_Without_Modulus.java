import java.util.Scanner;

class Odd_or_Even_Without_Mod{
	public static void main(String args[]){
	Scanner O = new Scanner(System.in);
	System.out.print("\n Enter  variable :");
	double f1 = O.nextDouble();
	while(f1>1)
	{
		f1=f1-2;

	}
	if(f1==1)
		System.out.println(" Odd number");
	else
		System.out.println(" Even number");	
	}
}
