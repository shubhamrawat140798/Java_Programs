import java.util.Scanner;

class Check_ch{
	public static void main(String args[]){
		Scanner O = new Scanner(System.in);
		System.out.print("\n Enter a character : ");
		char c = O.next().charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println(c+" is Vowel"); // for vowel 
		else
			System.out.println(c+" is Consonant"); // Consonant
	}
}
