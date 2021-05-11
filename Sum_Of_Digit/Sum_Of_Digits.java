import java.util.Scanner;
class SumDigit{
	static public void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a digit :");
		int a = O.nextInt();
		int b,sum = 0;                          //    Input is 573
		b=a;                                    //    Output is 5+7+3 = 15
		while(a>0)
		{
			sum = sum + a%10;
			a=a/10;
		}
		
		System.out.println(" Sum of the digit of "+b+" is : " +sum); 
	}
}
