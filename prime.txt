import java.io.*;
class  Buffer_Prime
{
public static void main()throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int i,n,c=0;
System.out.println("Enter a number");
n=Integer.parseInt(br.readLine());
for(i=0;i<=n;i++)
{
if(n%i==0)
c++;
}
if(c==2)
System.out.println("NUMBER IS A PRIME NUMBER");
System.out.println("NUMBER IS NOT A PRIME NUMBER");
}
}
