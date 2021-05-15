import java.util.Scanner;
class palindromDigit{
	static public void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a digit :");
		int a = O.nextInt();
		int b,sum=0;
		b=a;
		while(a>0)
		{
			sum = sum*10 + a%10;
			a=a/10;
		}
		
		if(b==sum)
			System.out.println(sum+" is a palindrom No. !");
		else 	
			System.out.println(sum+" is a not palindrom No. !");
	}
}
