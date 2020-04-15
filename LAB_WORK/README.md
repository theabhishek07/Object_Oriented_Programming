## JAVA LAB PROGRAMS

![](https://www.linuxfoundation.org/wp-content/uploads/2018/12/Logo-upes.png)

## UPES JAVA LAB MANUAL
### lab experiments


### EXPERIMENT – 2,3
## TITLE: *Basic Java Programming*

1.	Write a program to find the largest of 3 numbers.
2.	Write a program to add two number using command line arguments.
3.	Write a program to print Fibonacci series using loop.
4.	Write a program to implement a command line calculator.
5.	Write a program using classes and object in java.
6.	Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades            and print marks and grades in the tabular form. 

               Between 40 and 50 : PASS 
               Between 51 and 75 : MERIT 
 	             and above : DISTINCTION
               
7.	Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.  
            (For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
            213, 231, 312, 321.)
8.	Write a Java Program to accept 10 numbers in an array and compute the square of each number. Print the sum of these numbers.

9.	Write a program to input a number of a month (1 - 12) and print its equivalent name of 
            the month.( e.g 1 to Jan, 2 to Feb. 12 to Dec.)
10.	Write a program to find the sum of all integers greater than 40 and less than 250 that are divisible by 5.

### EXPERIMENT – 4
## TITLE: *Inheritance*

1.	Write a Java program to show that private member of a super class cannot be accessed from derived classes. 

2.	Write a program in Java to create a Player class. Inherit the classes  Cricket _Player, Football _Player and Hockey_ Player from Player class. 

3.	Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate. Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works. The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are. Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.

4.	Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning. The charges depend on the duration and the type of the call. Write a program using the concept of polymorphism in Java to calculate the charges.

5.	Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.   


### EXPERIMENT – 5
## TITLE: *Interface*

1.	Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.


2.	Write a program to create interface A, in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.

3.	Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program

4.	Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.

### EXPERIMENT – 6
## TITLE: *Package*

1.	Write a Java program to implement the concept of importing classes from user defined package and created packages.

2.	Write a program to make a package Balance. This has an Account class with Display_Balance method. Import Balance package in another program to access Display_Balance method of Account class. 

### EXPERIMENT – 7
## TITLE: *Exceptions*

1.	Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t cause illegal termination of program. 

2.	Write a Java program to enable the user to handle any chance of divide by zero exception. 

3.	Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments). 

4.	On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free to make necessary assumptions.

5.	Write a java program to throw an exception  for an employee details. 
* If an employee name is a number, a name exception must be thrown.
* If an employee age is greater than 50, an age exception must be thrown. 
* Or else an object must be created for the entered employee details

### EXPERIMENT – 8
## TITLE: *Strings Handling and Wrapper Class*

1.	Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or substring. 

2.	Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuilt function. 

3.	Write a program in Java to read a statement from console, convert it into upper case and again print on console. (Don’t use inbuilt function) 

4.	Write a program in Java to create a String object. Initialize this object with your name. Find the length of your name using the appropriate String method. Find whether the character ‘a’ is in your name or not; if yes find the number of times ‘a’ appears in your name. Print locations of occurrences of ‘a’ .Try the same for different String objects

## TITLE: *Wrapper Classes*

1.	Write a Java code that converts int to Integer, converts Integer to String, converts String to int, converts int to String, converts String to Integer converts Integer to int.

2.	Write a Java code that converts float to Float converts Float to String converts String to float converts float to String converts String to Float converts Float to float.

### EXPERIMENT – 9
## TITLE: *Threads and Collections*

1. Write a program to implement the concept of threading by extending Thread Class and Runnable interface.
2. Write a program for generating 2 threads, one for printing even numbers and the other for printing odd numbers.
3. Write a program to launch 10 threads. Each thread increments a counter variable. Run the program with synchronization. 
4. Write a Java program to create five threads with different priorities. Send two threads of the highest priority to sleep state. Check the aliveness of the threads and mark which thread is long lasting

## TITLE: *Collections*

1.	Write a program for the following:

* Read all elements from ArrayList by using Iterator.
* Create duplicate object of an ArrayList instance.
* Reverse ArrayList content.

2.	Write a program for the following HashMap

* find whether specified key exists or not.
* find whether specified value exists or not
* get all keys from the given HashMap
* get all key-value pair as Entry objects

3.	Write a program for the following HashSet

* copy another collection object to HashSet object.
* delete all entries at one call from HashSet
* search user defined objects from HashSet

### EXPERIMENT – 10
## TITLE: *JDBC*

1.	Create a database table to store the records of employee in a company. Use getConnection function to connect the database. The statement object uses executeUpdate function to create a table.

2.	Create a database of employee of company in mysql and then use java program to access the database for inserting information of employees in database. The SQL statement can be used to view the details of the data of employees in the database.

### EXPERIMENT – 11
## TITLE:  *Servlet*
1.	Servlet:  a) ServletContext interface  b)getParameterValues( ) of Servlet Request
2.	Write a Servlet page to display current date of the server.
3.	Write a Servlet page to which include the two other Servlet page through of include directives feature provided in Servlet.
4.	Write a Servlet page to create a simple calculator.

### EXPERIMENT – 12
## TITLE: *JSP*

Project Specification: (Write the following classes in same project named as Proj_Lab9)
Objective: After these lab exercises students will be in position to clear the concept of JSP and how to write the server side scripting language.
 1.  Write a JSP page to access the data of a student from the student table.
 2.  Write a JSP Login page to enter the username and password entered by
     user and display the welcome page on successful login otherwise display
     wrong authentication page.

