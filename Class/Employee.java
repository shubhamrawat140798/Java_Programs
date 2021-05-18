/*Q34. WAP to create a base class Employee with private data members as eid, ename, create a child class 
Programmer that extends base class Employee with data-members as experience, salary and create a child 
class Manager that extends class Employee with datamembers as specializaton, age. Display all the details 
by reading all the data from user. Output should be like this: 
Emp id is: 
Emp Name is: 
Exp is:
Salary is:
Age is: 
Specialization is:
*/
import java.util.Scanner;
class Employee{
	
	private int  	 	empid;
	private String		empname;
		
	public void insert(int a,String b){
		empid 	= a;
		empname = b;
		
	}
	public void display(){
		System.out.println(" Emp id is   : " + empid);
		System.out.println(" Emp name is : " + empname);
			
	}
	
}

//Child class
 class Programmer extends Employee{
	
	int experience;
	int salary;
	
	public void insertRecord(int d,int f){
		
		experience = d;
		salary = f;
	}
	public void disp(){
		
		display();
		System.out.println(" Experience  : "+experience+"\n Salary      : "+salary); 
		
	} 
}
class Manager{
	String specializaton;
	int age;
	public void insertRecord(String d,int f){
		
		specializaton = d;
		age = f;
	}
	public void display(){
		System.out.println(" Emp specializaton is   : " + specializaton);
		System.out.println(" Emp age is : " + age);
			
	}
}

class inheritance{
	static public void main(String args[]){
		Programmer P1 = new Programmer();
		Manager M1 = new Manager();
		Scanner O = new Scanner(System.in);
		System.out.println(" [ Shubham Rawat ] \n [ MCA 2020 - 2022 ]");
		
		System.out.print("\n Enter Employee Id : ");
		int q = O.nextInt();
		
		System.out.print("\n Enter Employee Name : ");
		String w = O.next();
		
		System.out.print("\n Enter Employee experience : ");
		int e = O.nextInt();
		
		System.out.print("\n Enter Employee Salary : ");
		int r = O.nextInt();
		
		System.out.print("\n Enter Employee Specialization : ");
		String a = O.next();
		
		System.out.print("\n Enter Employee Age : ");
		int s= O.nextInt();
		
		P1.insert(q,w);
		M1.insertRecord(a,s);
		P1.insertRecord(e,r);
		P1.disp();
		M1.display();	
		
	}
}
