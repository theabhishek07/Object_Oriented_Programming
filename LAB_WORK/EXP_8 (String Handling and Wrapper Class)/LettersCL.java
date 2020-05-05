import java.io.*;
class LettersCL
{
public static void main(String a[]) throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter file Statement:");
String s1=in.readLine();
System.out.println(s1.toUpperCase());
}
}
