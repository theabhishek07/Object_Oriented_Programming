
//5)	Design a class employee of an organization. An employee has a name, empid, and salary. Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary. Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage. Derive a subclass Manager from employee. Add an instance variable named department to the manager class. Supply a test program that uses theses classes and methods.   


class Manager extends employee
{ 
  public int depart_id;
} 


// Driver class 
public class employee 
{ 
public String name;
public int empid,salary;

employee()
{
System.out.println("object created, set the values");
}
employee(int eid,String name,int sal)
{
this.name=name;
empid=eid;
salary=sal;
}


public String getname()
{
return name;
}

public int getsalary()
{
return salary;
}

public void increasesalary(int per)
{
salary+=(salary*per)/100;
}


    public static void main(String[] args) 
    { 
        employee g1 = new employee(67759,"Aman",500000); 
        System.out.println("Employee Salary:"+g1.getsalary());
        System.out.println("Employee Name:"+g1.getname());
	g1.increasesalary(10);
        System.out.println("Employee Salary:"+g1.getsalary());
    } 
}
