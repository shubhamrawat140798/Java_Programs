/*Q32. WAP to create a base class Employee with empid, empname, age as private data-members, inherit it and
 create a child class Programmer with data members as experience, workingdays, salary, method to calculate 
 salary based on no of working days in a month and display all the details.
Output should be like this:
Id is
Name is
Age is 
Experience is
Salary is
Working Days
Total Salary
*/
//Super class
class Employee{
	
	private int  	 	empid;
	private String		empname;
	private int 		age;
	
	public void insert(int a,String b,int c){
		empid 	= a;
		empname = b;
		age 	= c;
	}
	public void display(){
		System.out.println(" Emp id is   : " + empid);
		System.out.println(" Emp name is : " + empname);
		System.out.println(" Emp age is  : " + age);	
	}
	
}

//Child class
 class Programmer extends Employee{
	
	int experience;
	int workingdays;
	int salary;
	
	public void insertRecord(int d,int e,int f){
		
		experience = d;
		workingdays = e;
		salary = f;
	}
	public void calculateSalary(){
		int totalSal;
		totalSal = workingdays*salary;
		display();
		System.out.println(" Experience  : "+experience+"\n Salary      : "+salary+"\n Working Days: "+workingdays+"\n Total Salary:"+totalSal); 
		
	} 
}

class inheritance{
	static public void main(String args[]){
		Programmer P1 = new Programmer();
		System.out.println(" [ Shubham Rawat ] \n [ MCA 2020 - 2022 ]");
		P1.insert(1,"aman",20);
		P1.insertRecord(2,6,1000);	
		P1.calculateSalary();	
	}
}
