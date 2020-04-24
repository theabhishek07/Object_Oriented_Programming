//Q6. Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. 
        //Between 40 and 50 : PASS 
        //Between 51 and 75 : MERIT 
 	//and above : DISTINCTION

//Program:-
import java.util.*;
public class Student{
    public static void main(String[] args) {
         int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
        if(40<percentage && percentage< 50)
        {
             System.out.println("PASS");
        } 
        else if(51<percentage && percentage<75)
        {
            System.out.println("MERIT");
        } 
        else 
        {
            System.out.println("DESTINCTION");
        }
            }
    }

