import java.util.Scanner;
class SearchArray{
	public static void main(String args[]){
		int[] arr = new int[5];
		int n,l=-1;
		Scanner O = new Scanner(System.in);
		System.out.println(" Enter values in array");
		for(int i = 0; i < arr.length; i++){
			System.out.print("\n a["+i+"] : ");
			arr[i] = O.nextInt();
		}
		System.out.print("\n Enter variable to search : ");
		n = O.nextInt();
		for(int i = 0; i < arr.length ; i++){
			if(arr[i]==n){
				System.out.println(n+" found on a["+i+"]");
				l++;
			}	
		}
		if(l==-1)
			System.out.println(" Enter variable "+n+" is not present in the array!");		
	}
}
