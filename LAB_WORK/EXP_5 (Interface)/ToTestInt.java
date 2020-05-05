//1)	Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.I

interface Test
{
int square(int a);
}
class arithmetic implements Test
{
int num;
public int square(int a){ return a*a;}
int add(int a){ return a+a;}
}
public class ToTestInt
{
public static void main(String args[]){

arithmetic a1= new arithmetic();
System.out.println(a1.square(2));

}
}
