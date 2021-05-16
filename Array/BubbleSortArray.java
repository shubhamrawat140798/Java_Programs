class sortArray{
	static public void main(String args[]){
		int[] arr = new int[]{44,12,22,3,38,12};
		System.out.print(" \n\n\n\n Before Sorting : ");
		for(int i=0; i < arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		for(int i=0; i < arr.length; i++){
			for(int j = 0 ; j < arr.length-1 ; j++){
				if(arr[j]>arr[j+1]){
					arr[j]   = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j]   = arr[j] - arr[j+1];
				}
			}
		}
		System.out.print(" \n\n\n\n After  Sorting : ");
		
		for(int i=0; i < arr.length; i++ )	
			System.out.print(" "+arr[i]);
			System.out.print(" \n\n\n");
	}
}
