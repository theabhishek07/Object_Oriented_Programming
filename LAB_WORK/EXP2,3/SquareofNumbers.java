//Q8. Write a Java Program to accept 10 numbers in an array and compute the square of each number. Print the sum of these numbers.

//Program:-
import java.util.*;
public class SquareofNumbers {
 public static void main(String[] args) {
          int n, sum = 0;
        Scanner s = new Scanner(System.in);
        n=10;
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i]*a[i];
        }
        System.out.println("Sum:"+sum);
    }
    }

