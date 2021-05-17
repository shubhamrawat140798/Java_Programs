/*Q31. Write a program to create a class Test1 in package pack1 and define method checkarmstrong() to 
check a no is armstrong or not and create class Test2 in package pack2 and invoke checkarmstrong() 
from Test2 class.*/
package pack1;
public class  Test1{

	public void Checkarmstrong(int n){
		int sum = 0;
		int res = n,a;
		while(n>0){
			a=n%10;
			sum = sum + a*a*a;
			n=n/10;	
		}
		if(res==sum)
			System.out.println(sum+" it is armstrong");
		else
			System.out.println(sum+" it not is armstrong");
	}

}

