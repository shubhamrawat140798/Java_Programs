
class Mythread10 extends Thread
{
	int a;
	public void insert(int b)
	{
		a=b;
	}
	public void run()
	{	
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName(" "+a+" ");
                System.out.println(Thread.currentThread().getName());
		for(int i=1;i<10;i++)
		{
			System.out.println("Thread"+Thread.currentThread().getName()+" "+a*i);
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName(" change main ");
                System.out.println(Thread.currentThread().getName());
		Mythread10 ob =new Mythread10();
		ob.start();
		ob.insert(2);
		Mythread10 ob1 =new Mythread10();
		ob1.insert(3);
		ob1.start();	
	}

}
