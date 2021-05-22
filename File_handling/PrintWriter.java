/*
Q59. WAP to create a file using PrintWriter by reading the rollno and name from user and display on console.
*/
import java.util.Scanner;
import java.io.*;
class PrWrt{
	public static void main(String[] args)throws IOException{
		FileWriter fw = new FileWriter("f1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter roll No. : ");
		int rollno = O.nextInt();
		System.out.print("\n Enter name : ");
		String name = O.next();
		pw.println(rollno);
		pw.println(name);
		pw.close();
		System.out.println("Success");
		FileReader fr = new FileReader("f1.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line !=null){
		System.out.println(line);
		line = br.readLine();
		}
		br.close();
	}
}
