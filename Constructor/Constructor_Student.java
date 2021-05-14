/*
Q30. WAP to create a class Student with private data members as roll_no, name, age, marks in 3 subjects, define a function to 
calculate the total marks of students, define a function to display all the details of student. Create two student objects and 
initialize one object with default and other with parameterized constructor.
*/
class Student{
	private int roll_no;
	private String name;
	private int age;
	private float mark1,mark2,mark3,result;
	Student(){					// default constructor	
		roll_no = 101;
		name = "xyz";
		age = 18;
		mark1 = 45;
		mark2 = 45;
		mark3 = 45;
	}
	Student(int rollno, String sname, int sage, float m1, float m2, float m3){ // parameterized constructor
		roll_no = rollno;
		name = sname;
		age = sage;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	void totalMarks(){
		result = (mark1+mark2+mark3)/3;
	}
	void display(){
		System.out.println("Roll no    : "+roll_no);	
		System.out.println("Name       : "+name);
		System.out.println("Age        : "+age);
		System.out.println("marks 1    : "+mark1);
		System.out.println("marks 2    : "+mark2);
		System.out.println("marks 3    : "+mark3);
		System.out.println("Total marks: "+result);

	}
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student(100,"abc",20,65.5f,65.5f,65.5f);
		s1.totalMarks();
		s2.totalMarks();
		s1.display();
		s2.display();
	}
}
