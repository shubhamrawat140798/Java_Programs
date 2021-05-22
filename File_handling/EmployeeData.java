/*
Q60. WAP to create a class Employee with data members as empid, empname, salary from and create 3 objects and write data into file and display on console too.
*/
import java.io.*;
class Employee implements Serializable{
	int empid;
	String empname;
	double salary;
	Employee(int empid, String empname, double salary){
		this.empid   = empid;
		this.empname = empname;
		this.salary  = salary;
	}
	public static void main(String[] args)throws Exception{
		Employee[] E ={ new Employee(231,"rahul",50000),new Employee(121,"deepak",250000),new Employee(221,"saksham",53000)};
		FileOutputStream fout=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(E);
		out.flush();
		System.out.println("success");
		
		FileInputStream fin;
		ObjectInputStream in;
		
		fin = new FileInputStream("f.txt");
		in = new ObjectInputStream(fin);
		Employee[] E1 = (Employee[])in.readObject();
		for(Employee e: E1){
			System.out.println("\n employee ID : "+e.empid+"\n employee name : "+ e.empname +"\n employee salary : "+e.salary);
		}	
		
	}
}
