/*
Q57. WAP to create a file using FileWriter class by passing File as reference variable and write the content Hello how are you, and in the same file write I am fine. Also find size of file. Also display the content on the console from the file.
Hint: File f=new File("f1.txt");
f.length();
*/
import java.io.*;
import java.util.*;

class FileW
{
	public static void main(String[] args)throws IOException{
		File f  = new File("f1.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Hello how are you ");
		fw.write("\n I am fine");
		System.out.println("length of file :"+(f.length()));
		fw.flush();
		fw.close();
		System.out.println("Success");
	}
}
