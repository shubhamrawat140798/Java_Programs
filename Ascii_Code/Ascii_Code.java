import java.util.Scanner;

class Acsii{
	public static void main(String args[]){
		Scanner Obj = new Scanner(System.in);
		System.out.print("\n Enter a Character :");
		char c = Obj.next().charAt(0);
		int a = c;
		System.out.print("\n The ASCII Value of "+c+" : "+a+"\n");
		
	}
}
