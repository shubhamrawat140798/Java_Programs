import java.util.Scanner;
class sumArray{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++){ //for input
			System.out.print("\n Enter for a["+i+"] : ");
			a[i] = O.nextInt();
		}
		for(int i=0; i<5; i++){	// sum
			System.out.print(" "+a[i]);
			sum=sum+a[i];
		}
		System.out.println("\n Sum of array "+sum);
	}
}
