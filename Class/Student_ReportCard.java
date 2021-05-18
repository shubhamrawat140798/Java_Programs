/*
Q38. WAP to create a class Student with data members as rollno, name, age, create a method to insert
the values that should not be over-ridden, display() to display the values that should be over-ridden
then create a child class with data members as marks in 3 subjects, compute total marks and display 
all the data.
Output should be like this:
Roll no is:
Name is:
Age is;
Marks in first subject:
Marks in second subject:
Marks in third subject:
Total Marks:
*/
class Student{
	int rollno;
	String name;
	int age;
	public void insert(int a, String b, int c){
		rollno = a;
		name = b;
		age = c;
	} 
	public void display(){
		System.out.println("Roll No. : "+rollno);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
class Marks extends Student{
	int M1;	
	int M2;	
	int M3;
	public void insertMarks(int a, int b, int c){
	M1 = a;
	M2 = b;
	M3 = c;
	}
	public void display(){
		super.display();
		System.out.println("Marks in First subject : "+M1);
		System.out.println("Marks in Second subject : "+M2);
		System.out.println("Marks in Third subject : "+M3);
		System.out.println("Total Marks : "+(M1+M2+M3));	
	}
	
}
class abc{
	public static void main(String args[]){
		Marks M1 = new Marks();
		Marks M2 = new Marks();
		M1.insert(1,"Jane Austin",23);
		M2.insert(2,"Franklin",22);
		M1.insertMarks(45,45,34);
		M2.insertMarks(50,45,44);
		M1.display();
		M2.display();
		
	}
}
