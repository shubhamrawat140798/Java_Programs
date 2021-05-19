/*Q43. WAP to create custom checked and unchecked exception if the age of a candidate is below 18 years, message to be displayed as can't vote.*/
import java.io.*;
import java.util.Scanner;
class UnderAgeException extends Exception{
	UnderAgeException(){
		System.out.println(" you can't vote");
	}
}
class Voting{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter your Age : ");
		int age = O.nextInt();
		try{
		if(age<18){
			throw new  UnderAgeException();
		} 
		else{
			System.out.println(" you can vote ! ");
		}
		}
		catch(UnderAgeException e){
			System.out.println(e);
		}
		System.out.println(" bye ! ");
	}
}
