import java.util.Scanner;
class SumOfRowAndCol{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] row = new int[]{0,0,0};
		int[] col = new int[]{0,0,0};
		// for input 
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print("\n Enter for a["+i+"]["+j+"] : ");
				a[i][j] = O.nextInt();
			}
		}
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				row[i] = row[i] + a[i][j];
				col[i] = col[i] + a[j][i];				
			}
		}
		for(int i = 0; i< a.length ; i++){
			System.out.println("\n Sum of row["+i+"] : "+row[i]);
		}
				for(int i = 0; i< a.length ; i++){
			System.out.println("\n Sum of column["+i+"] : "+col[i]);
		}
	}
}

