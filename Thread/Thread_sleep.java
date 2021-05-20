import java.util.Scanner;
class MyThread extends Thread
{
	int n;
	public void insert(int a){
		n=a;
	}
	public void run()
	{
		try{
			for(int i = n; i>0;i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("Time Out");
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
	public static void main(String[] args){
		MyThread Ob = new MyThread();
		Scanner o = new Scanner(System.in);
		System.out.print("\n Enter seconds : ");
		int b= o.nextInt();
		Ob.insert(b);
		Ob.start();
	}
}
