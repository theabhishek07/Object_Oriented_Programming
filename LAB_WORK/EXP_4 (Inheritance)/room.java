//Q1. Write a Java program to show that private member of a super class cannot be accessed from derived classes. 

//Program:-
class room
{
private int l,b;
room(int x,int y)
{ l=x; b=y;}
int area()
{return(l*b);}
}
class class_room extends room
{
int h;
class_room(int x,int y,int z)
{
super(x,y);
h=z;
}
int volume()
{
return(area()*h);
}
}
public class Exp4Q1 {
   public static void main(String[] args) {
        class_room cr=new class_room(10,20,15);
        int a1=cr.area();
        int v1=cr.volume();
        System.out.println("Area of Room : "+a1);
        System.out.println("Volume of Room : "+v1);
}
    }

