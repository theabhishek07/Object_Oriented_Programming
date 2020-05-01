//Q10. Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.

//Program:-
public class SumofIntegers{
    public static void main(String[] args) {
       int result=0;
         	for(int i =40;i<250;i++){
			if(i%5==0)
				result+=i;
		}
		System.out.println("Output of Program is : "+result);
    }
    
}

