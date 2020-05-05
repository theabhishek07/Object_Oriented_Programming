import java.util.*;
class direction extends Exception{
	direction(){
		super("collision");
	}
}
public class collision{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the direction same or opposite");
	String a=sc.nextLine();
	
	try{
		if (a.equals("opposite")){
			throw new direction();
		}
		else{
   
   System.out.println("no problem");
   
	}}

	catch(direction e)
{
	System.out.println(e);
}
System.out.println("try another time");
}
}
