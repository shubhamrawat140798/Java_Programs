//WAP to find maximum among three numbers.
import java.util.Scanner;

class Max_in_three{
	public static void main(String args[]){
		Scanner o = new Scanner(System.in);
		int a,b,c;
		System.out.print("\n Enter first no. : ");
		a = o.nextInt();
		System.out.print("\n Enter second no. : ");
		b = o.nextInt();
		System.out.print("\n Enter third no. : ");
		c = o.nextInt();
		if(a>b){
			if(a>c)
				System.out.println(a+" Greater among "+a+","+b+" & "+c);
			else
				System.out.println(c+" Greater among "+a+","+b+" & "+c);
		}
		else{
			if(b>c)
				System.out.println(b+" Greater among "+a+","+b+" & "+c);
			else
				System.out.println(c+" Greater among "+a+","+b+" & "+c);
		}
	}
}


