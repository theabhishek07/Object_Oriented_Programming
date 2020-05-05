class Occurence 
{ 
public static void main (String[] args) 
{ 
String str = "Hey! This is ABHISHEK SHARMA.";  
int firstIndex = str.indexOf('s'); 
System.out.println("First occurrence of char 's'" + " is found at : " + firstIndex); 
int lastIndex = str.lastIndexOf('s'); 
System.out.println("Last occurrence of char 's' is" + " found at : " + lastIndex); 
int first_in = str.indexOf('s', 10); 
System.out.println("First occurrence of char 's'" + " after index 10 : " + first_in); 
int last_in = str.lastIndexOf('s', 20); 
System.out.println("Last occurrence of char 's'" + " after index 20 is : " + last_in); 
int char_at = str.charAt(20); 
System.out.println("Character at location 20: " + char_at); 
} 
}
