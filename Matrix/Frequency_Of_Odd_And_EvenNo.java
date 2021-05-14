import java.util.Scanner;
class freqencyOfOddAndEven{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		int[][] a = new int[3][3];
		int odd = 0,even = 0;
		// for input 
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print("\n Enter for a["+i+"]["+j+"] : ");
				a[i][j] = O.nextInt();
			}
		}
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(a[i][j]%2==0)
					even++;
				else
					odd++;	
			}
		}
		System.out.println("\n\n Even frequency : "+even+"\n Odd frequency : "+odd);
	}
}
