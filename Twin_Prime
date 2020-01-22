import java.io.*;
class TWIN_PRIME 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c1 = 0, c2 = 0;
		System.out.println("ENTER FIRST NUMBER");
		a = Integer.parseInt(br.readLine());
		System.out.println("ENTER SECOND NUMBER");
		b = Integer.parseInt(br.readLine());
		for (int i = 1; i <= a; i++) 
		{
			if (a % i == 0)
			c1++;
		}
		for (int j = 1; j <= b; j++) 
		{
			if (b % j == 0)
			c2++;
		}
		if ((c1 == 2 && c2 == 2) && (a - b == 2 || b - a == 2))
			System.out.println("TWIN PRIME");
		else
			System.out.println("NOT A TWIN TRIME");
	}
}
