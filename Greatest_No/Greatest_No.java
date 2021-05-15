import java.util.Scanner;

class MaxNo{
	public static void main(String args[]){
		Scanner Obj = new Scanner(System.in);
		System.out.print("\n Enter first No. : ");
		double f1 = Obj.nextDouble();
		System.out.print("\n Enter second No. : ");
		double f2 = Obj.nextDouble();
		double re;
		re=(f1>f2)? f1:f2;
		System.out.print("\n in between "+f1+" and "+f2+"\n "+re+" is Greater. \n" );
		
	}
} 
