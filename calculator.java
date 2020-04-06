import java.util.Scanner;
class calculator
 {
    public static void main(String[] args)
 {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char ch = reader.next().charAt(0);
        double result;

        switch(ch)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("ch is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", a, ch, b, result);
    }
}
