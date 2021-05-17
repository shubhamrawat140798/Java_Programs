/*   T<=0----very cold
             0<T<=10---cold
             11<T<=20---cool
            20<T<=30---warm
            T>30---hot
*/
import java.util.Scanner;
class Temperature_ELSE_IF_LADDER{
	public static void main(String args[])
	{
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a temperature: ");
		int T= O.nextInt();
		if(T<=0)	
			System.out.println(" Very Cold: "+T);
		else if(T>0 && T<=10)	
			System.out.println(" Cold: "+T);
		else if(T>=11 && T<=20)	
			System.out.println(" Cool: "+T);
		else if(T>20 && T<=30)	
			System.out.println(" Warm: "+T);		
		else if(T>30)	
			System.out.println(" Hot: "+T);
		else
			System.out.println(" Wrong Input");	
	}

}
