package snippets;

import java.util.Scanner;

abstract class Car
{
	protected double efficiency;
	protected double leftOver;
	
	public abstract double getRemainingDistance();
}
class DieselCar extends Car
{
	public DieselCar(double efficiency, double leftOver)
	{
		this.efficiency = efficiency;
		this.leftOver = leftOver;
	}
	
	public double getRemainingDistance()
	{
		return efficiency * leftOver;
	}
}

class ElectricCar extends Car
{
	public ElectricCar(double efficiency, double leftOver)
	{
		this.efficiency = efficiency;
		this.leftOver = leftOver;
	}
	
	public double getRemainingDistance()
	{
		return 100000/(leftOver/100*efficiency);
	}
}
public class Question3 
{
	public static void main(String args[])
	{
		Car cars[];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		cars = new Car[n];
		
		for(int i=0; i<n; i++){
			int type = in.nextInt();
			if(type == 1)
				cars[i] = new DieselCar(in.nextDouble(), in.nextDouble());
			else
				cars[i] = new ElectricCar(in.nextDouble(), in.nextDouble());
			
		}
		in.close();
		for(Car c:cars)
			System.out.println(c.getRemainingDistance());
	}
}