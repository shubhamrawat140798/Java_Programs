class JavaResumeExp implements Runnable
{

public void run()
{
int c = 2*2;
System.out.println(Thread.currentThread().getName());
System.out.println(c);
}
public static void main(String args[])
{
// creating three threads
JavaResumeExp m1=new JavaResumeExp ();
JavaResumeExp m2=new JavaResumeExp ();
JavaResumeExp m3=new JavaResumeExp ();
Thread t1 =new Thread(m1);
Thread t2 =new Thread(m2);
Thread t3 =new Thread(m3);
// call run() method

t1.start();
t2.start();
t2.suspend(); // suspend t2 thread
t3.start();
t3.stop();
t2.resume(); // resume t2 thread
}
}
