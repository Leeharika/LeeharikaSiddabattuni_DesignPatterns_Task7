package FactoryPattern;
public class Car implements Transport
{
	@Override
	public void getRide() 
	{
		System.out.println("Get a ride in Car");
	}
}
