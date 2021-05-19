/*Q41. WAP to implement any unchecked exception with multiple catch handlers.*/
class abc{
	public static void main(String args[]){
	int a = 5, b=0;
	
	try{
		System.out.println(a/b);
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println(" rest of code !");
	}	
}
