import java.util.Scanner;
interface Vehicle{
 	 void getspeed();	
}

interface Transport{
	 void getspeed();
}
class abc implements Vehicle, Transport{  
	
	
	public void getspeed(){
		Scanner O=new Scanner(System.in);
		System.out.print("\n Enter  distance in Kilometer: ");
 		int km = O.nextInt();
 		System.out.print("\n Speed in Kilometer per Hour : ");
		int hr = O.nextInt();
 		System.out.println(" Transport time  : "+(km/hr)+"Hr");
	
		
		
	}  
  
	public static void main(String args[]){  
		abc obj = new abc();  
		obj.getspeed();  
 	}  
}  
