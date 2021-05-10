import java.util.Scanner;
class matrixTranspose{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] T = new int[3][3];
		// for input
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print("\n Enter for a["+i+"]["+j+"] : ");
				a[i][j] = O.nextInt();
			}
		}
		System.out.println(" Matrix A \n");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.print("\n");
		}
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				T[j][i]=a[i][j];
			}
		}
		System.out.println("Transpose of  Matrix A \n");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print(" "+T[i][j]);
			}
			System.out.print("\n");
		}
	}
}
