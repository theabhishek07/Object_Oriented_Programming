//Q7. Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.  
//(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 213, 231, 312, 321.)

//Program:-
public class Combinations {
  public static void main(String[] args) {
        int[] input = { 1, 2, 3 };
  for (int x = 0; x < 3; x++) {
   for (int y = 0; y < 3; y++) {
    for (int z = 0; z < 3; z++) {
     if (x != y && y != z && z != x) {
      System.out.println(input[x] + "" + input[y] + ""
        + input[z]);
     }
    }
   }
  }
}
    }

