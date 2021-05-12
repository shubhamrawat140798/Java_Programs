import java.util.Scanner;
class fabonacci{
	static public void main(String args[]){
		int n1=0,n2=1,n3;
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a series :");
		int a = O.nextInt();
		System.out.print("\n "+n1+" , "+n2);
		for(int i =2;i<a;i++){
			n3 = n1 + n2;
			System.out.print(" , "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
