class even extends Thread
{
Thread t=null;
even()
{
t=new Thread(this);
start();
}
public void run()
{
try
{
for(int i=2;i<50;i+=2)
System.out.print(i+" ");
Thread.sleep(100);
}
catch(Exception e)
{System.out.println("thread interepted");}
}
}
class odd extends Thread
{
Thread t=null;
odd()
{
t=new Thread(this);
start();
}
public void run()
{
try
{
for(int i=1;i<50;i+=2)
System.out.print(i+" ");
Thread.sleep(100);
}
catch(Exception e)
{System.out.println("thread interepted");}
}
}
class Even_Odd
{
public static void main(String arg[])
{
even e=new even();
odd o=new odd();
}
}
