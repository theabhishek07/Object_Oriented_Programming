
//4) Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.

interface cal
{
int division(int num);
int modules(int num);
}
public class Calculator implements cal
{
public int division(int num){
return num/2;
}
public int modules(int num){
return num%2;
}
public static void main(String args[])
{
Calculator c1= new Calculator();
System.out.println(c1.division(2));
System.out.println(c1.modules(2));
}

}
