//Q5. Write a program using classes and object in java.

//Program:-
public class Student {
     int student_age;
public Student(String name) {
      System.out.println("Nameis :" + name );
   }
   public void setAge( int age ) {
      student_age = age;
   }
   public int getAge( ) {
      System.out.println("Student's age is :" + student_age );
      return student_age;
   }
   public static void main(String[] args) {
      Student s = new Student( "ABHISHEK" );
      s.setAge( 20 );
      s.getAge( );
      System.out.println("Variable Value :" + s.student_age );
    }
    }

