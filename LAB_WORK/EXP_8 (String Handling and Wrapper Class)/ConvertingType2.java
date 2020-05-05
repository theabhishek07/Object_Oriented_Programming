public class ConvertingType2 
{
public static void main(String[] args) 
{
Float fObj = new Float("78.50");
byte b = fObj.byteValue();
System.out.println(b);
short s = fObj.shortValue();
System.out.println(s);
int i = fObj.intValue();
System.out.println(i);
float f = fObj.floatValue();
System.out.println(f);
double d = fObj.doubleValue();
System.out.println(d);
String si = fObj.toString();
System.out.println(si);
}
}
