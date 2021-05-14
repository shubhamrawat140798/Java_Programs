
class Frequency_array{
	public static void main(String args[]){
		int[] arr = new int[]{1,2,3,4,2,2,6,3};
		int[] frr = new int[arr.length];
		int visited = -1;
		for(int i = 0; i < arr.length;i++){
			int count = 1;
			for(int j = i + 1; j < arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					frr[j]=visited;
				}
			}
			if(frr[i]!=visited)
				frr[i]=count;
			
		}	
		System.out.println("    No.   : frequence");
		for(int i = 0; i < frr.length;i++){
			
			if(frr[i]!=visited)
				System.out.println("     "+arr[i]+"    :    "+frr[i]);
		}
	} 
}
