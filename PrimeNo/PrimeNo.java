import java.util.Scanner;
class Prime{
	static public void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a digit :");
		int a = O.nextInt();
		int flag=0;
		for(int i=2;i<=a;i++){
			if(a%i==0)	
				flag++;	
		}
		if(flag==1)
			System.out.println(a+" is a prime No. !");
		else 	
			System.out.println(a+" is a not prime No. !");
	}
}
