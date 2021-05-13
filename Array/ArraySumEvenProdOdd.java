class ArraySumEvenProdOdd{
	 public static void main(String args[]){
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		int sum = 0,prod = 1;
		for(int i=0; i < arr.length; i++){
			if((i+1)%2==0)	
				sum = sum + arr[i];
			else
				prod = prod*arr[i];
		}
		System.out.println("\n ");
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(" "+arr[i]);		
		}
		System.out.println("\n sum of even place : "+sum);
		System.out.println("\n product of odd place : "+prod);
	}
}
