//WAP to check a year is leap or not.

import java.util.Scanner;

class Leap_Year
{
	public static void main(String args[])
	{
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a year :" );
		int year = O.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println(year+" is  leap year");
				}
				else
					System.out.println(year+" is not leap year");
			}
			else
				System.out.println(year+" is  leap year");
		}
		else
			System.out.println(year+" is not leap year");
	}
}

