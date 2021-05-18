class Obj{
	static int count = 0;
	Obj(){
		count++;
	}
	static void totalObject()
	{
		System.out.println(" Total Object are : "+count);
	}
}	
class abc{	
	public static void main(String args[]){
		Obj O1 = new Obj();
		Obj O2 = new Obj();
		Obj O3 = new Obj();
		O3.totalObject();
	}
	
}
