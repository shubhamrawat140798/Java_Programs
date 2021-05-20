class Booking
{
	static int Seat = 10;
	synchronized void book(int n){
		if(Seat>n){
			Seat=Seat-n;
		System.out.println(n+" Seats booked");
		}
	}
}
class MyThread extends Thread
{
	int n;
	Booking t;
	MyThread(Booking t){
		this.t=t;
	}
	
	public void insert(int a)
	{
		n=a;
	}
	public void run()
	{
		t.book(n);
	}
	public static void main(String[] args){
		Booking obj = new Booking();
		MyThread t1 = new MyThread(obj);
		MyThread t2 = new MyThread(obj);
		t1.insert(7);
		t2.insert(6);
		t1.start();
		t2.start();
	}
}
