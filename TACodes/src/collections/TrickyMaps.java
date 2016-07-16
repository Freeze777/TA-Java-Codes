package collections;

import java.util.HashMap;
import java.util.Map;

class Person
{
	String name;
	int id;
	public Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return name;
	}
	
}
public class TrickyMaps 
{
	public static void main(String args[])
	{
		HashMap<Person,Person> marraige = new HashMap<Person,Person>();
		
		marraige.put(new Person("Freeze",1),new Person("Frinju", 36));
		marraige.put(new Person("Palash",2),new Person("palashi",37));
		marraige.put(new Person("Freeze",1), new Person("xyz",24));
		
		//guess the output
		for(Map.Entry<Person, Person> e:marraige.entrySet())
			System.out.println(e.getKey()+" is married to "+e.getValue());
	}
}
