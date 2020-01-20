class fibbo
{
    public static void main(String[] args)
 {
        int n = 10, a = 0, b = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " + ");
            int c = a + b;
            a = b;
            b = c;
        }
 }
}
