import java.util.Scanner;

class Swap_Three_Var{
	public static void main(String args[]){
	Scanner O = new Scanner(System.in);
	System.out.print("\n Enter first variable :");
	double f1 = O.nextDouble();
	System.out.print("\n Enter second variable :");
	double f2 = O.nextDouble();
	double f3;
	System.out.print("\n First variable : "+f1+" and Second variable :"+f2);
	f3=f1;
	f1=f2;
	f2=f3;
	System.out.print("\n\t\t\t After Swap \n First variable : "+f1+" and Second variable :"+f2+"\n");

	}
}
