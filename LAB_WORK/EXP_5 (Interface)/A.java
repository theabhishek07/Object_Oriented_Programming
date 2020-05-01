//2) Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.
interface A
{
void meth1();
void meth2();
}

public class MyClass implements A
{
public void meth1(){System.out.println("Method1");}
public void meth2(){System.out.println("Method2");}
	public static void main(String args[])
	{
	MyClass obj = new MyClass();
	obj.meth1();
	obj.meth2();
	}
}
