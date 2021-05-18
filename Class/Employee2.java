/*
Q36. WAP to create a base class Employee with data members as empid, empname, empage , workingdays, 
salary, form parametrized constructor to initialize the instance variables and keep local variables 
names of constructor same as instance variables, create a function to display these instance variables 
and calculate salary based on working days then create a child class Manager with datamember as bonus, 
now over-ride the salary method and add bonus amount too and display all details along with updated salary.
Output should be like this:
Emp id is;
Emp Name is:
Age is ;
No of Working Days:
Salary is;
Total Salary:
Bonus is:
New Salary:
*/
class Employee{
	public	int empid;
	public String empname;
	public int empage;
	public int workingdays;
	public int salary; 
	public void Employee(int empid, String empname, int empage, int workingdays,int salary){
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
		this.workingdays = workingdays;
		this.salary = salary;
	}
	public void display(){
		System.out.println("\n Emp id is : "+empid+"\n Emp Name is : "+empname+"\n Age is : "+empage+"\n No of Working Days : "+workingdays+"\n Salary is : "+salary);
	}
	public void salary(){
		System.out.println("\n Total Salary : "+(salary*workingdays));
	}
	
}
class Manager extends Employee{
	int bonus = 10;
	public void salary(){
		super.salary();
		int total = salary*workingdays + bonus;
	System.out.println("\n Bonus : "+bonus+"\n New Salary : "+total) ;
	}
}
class abc{
	public static void main(String args[]){
		Manager M1 = new Manager();
		M1.Employee(1,"Shubham",23, 12,1000);
		M1.display();
		M1.salary();
		
		
	}

}
