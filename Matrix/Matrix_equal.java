import java.util.Scanner;
class matrixEqual{
public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int k=0;
		// for input a
		System.out.print("\n Enter for A matrix\n ");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print("\n Enter for A["+i+"]["+j+"] : ");
				a[i][j] = O.nextInt();
			}
		}
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print("\n Enter for B["+i+"]["+j+"] : ");
				b[i][j] = O.nextInt();
			}
		}
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(b[i][j]!=a[i][j]){
					k++;
				}
			}
		}
		if(k==0)
			System.out.println("\n Matrix A is equal to Matrix B !");
		else
			System.out.println("\n Matrix A is not equal to Matrix B !");
	}	
}
