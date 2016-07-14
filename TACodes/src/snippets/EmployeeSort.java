package snippets;

import java.util.Arrays;
import java.util.Comparator;

class Employee
{
	int id;
	String name;
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return id+" "+name;
	}
	
}

class EmployeeComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return(e1.id) - (e2.id);
	}
}

public class EmployeeSort 
{
	public static void main(String args[])
	{
		Employee e[] = new Employee[2];
		e[0] = new Employee(10,"Arun");
		e[1] = new Employee(1,"Nishi");
		Arrays.sort(e,new EmployeeComparator());
		for(Employee i:e)
			System.out.println(i);
		
	}
}
