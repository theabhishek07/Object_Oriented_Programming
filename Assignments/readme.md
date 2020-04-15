# JAVA ASSIGNMNENT

**Q1.** Create the abstract class Animal and a set of two or three animal sub-classes 
such asTiger   and Lion. 

Details for Animal class is- 

*  **String getName()** - which returns the name of the animal.  
*  **int getAge()** - which returns the age in years.  
*  **void talk()** - which causes the animal to display on the screen their name, age and         
                what type of animal they are.  
                
 Create a Zoo class containing an array of references to animals with the functionality below-
 
 The Zoo provides the following methods :-
 *  **addAnimal(Animal newAnimal)** - which adds a new animal to the Zoo. 
 *  **displayAnimals()** - which displays a list of the type and name of all animals in the zoo.  
 *  **void feedingTime()** - which causes all animals in the zoo to talk one after the other.  
 
The main  class has following functionalities- 

* Add a new animal to the zoo - first prompting for name and type and creating the animal. 
* Display all animals currently in the zoo.
* Display the name and age of the animal in a selected type. Trigger feeding time.  
* Implement a menu-driven main program which uses the Zoo and the various animal classes and test it. 

 **Q2.** Create a class Rectangle. The class has attributes length and width, each of which defaults to 1. 
 It has member functions that calculate the perimeter and the area of the rectangle. 
 It has set and get functions for both length and width.
 The set functions should verify that length and width are each floating-point numbers
 larger than 0.0 and less than 20.0 otherwise should throw a user defined exception. 
 Create a more sophisticated constructor Rectangle of the class.
 This class stores only the Cartesian coordinates of the four corners of the rectangle.
 The constructor calls a set function that accepts four sets of coordinates and verifies that each of these 
 is in the first quadrant with no single x or y coordinate larger than 20.0 otherwise throw an exception. 
 The set function also verifies that the supplied coordinates do, in fact, specify a rectangle otherwise throw an exception.
 Member functions calculate the length, width, perimeter and area. 
 The length is the larger of the two dimensions.
 Include a function square that determines if the rectangle is a square. 
 
**Q3.** Imagine a publishing company that markets both book and audio cassette versions of its works.
Create a class publication that stores the title (a string) and price (type float) of a publication.
From this class derive two classes: book, which adds a page count (type int), and
tape, which adds a playing time in minutes (type float).
Each of these three classes should have a proper constructors, destructors and display functions to display its data. 
Write a main() program to test (a) order of constructor and destructor invocation, (b) the book a
nd tape classes by creating instances of them, asking the user to fill in data and then displaying the data.
Start with the publication, book, and tape classes of  ‘Ques-1’. 
Add an interface sales that declares functions to hold sales.
Include a function to get sales amounts from the user, and a function to display the sales figures.
Alter the book and tape classes so they are derived from both publication and sales.
An object of class book or tape should input and output sales data along with its other data.
Write a main() class to create a book object and a tape object and exercise their input/output capabilities.  
 
**Q4.** Assume that a bank maintains two kinds of accounts for customers, 
one called as savings account and other as current account. 
The savings account provides compound interest and withdrawal facilities but no cheque book facility. 
The current account provides cheque book facility but no interest. Current account holders also maintain a 
minimum balance and if the balance falls below this level, a service charge is imposed. 
Create a class account that stores customer name, account 
number (Should generate automatically if new customer added) and type of account. 
From this derive the classes cur_acct and sav_acct to make them more specific to their requirements.

Include necessary member functions in order to achieve the following tasks: 
*  *Accept deposit from a customer and update the balance* 
*  *Display the balance.*
*  *Compute and deposit interest.* 
*  *Permit withdrawal and update the balance.*
*  *Check for minimum balance, impose penalty, necessary and update the balance.*  
 
