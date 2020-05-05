//Q4. Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration and the type of the call. Write a program using the concept of polymorphism in Java to calculate the charges.

//Program:-
import java.io.*;
class call
{
float dur;
String type;
float rate()
{
if(type.equals("urgent"))
return 4.5f;
else if(type=="lightning")
return 3.5f;
else
return 3f;
}
}
class bill extends call
{
float amount;
DataInputStream in=null;
bill()
{
try
{
in=new DataInputStream(System.in);
}
catch(Exception e)
{ System.out.println(e); }
}
void read()throws Exception
{
String s;
System.out.println("enter call type(urgent,lightning,ordinary):");
type=in.readLine();
System.out.println("enter call duration:");
s=in.readLine();
dur=Float.valueOf(s).floatValue();
}
void calculate()
{
if(dur<=1.5)
amount=rate()*dur+1.5f;
else if(dur<=3)
amount=rate()*dur+2.5f;
else if(dur<=5)
amount=rate()*dur+4.5f;
else
amount=rate()*dur+5f;
}
void print()
{
System.out.println("**********************");
System.out.println(" PHONE BILL ");
System.out.println("**********************");
System.out.println(" Call type : "+type);
System.out.println(" Duration : "+dur);
System.out.println(" CHARGE : "+amount);
System.out.println("**********************");
}
}
public class Prog4{
   public static void main(String[] args) throws Exception {
   bill b=new bill();
b.read();
b.calculate();
b.print();     
   }
    }

