package FactoryPattern;
public class FactoryPatternExample 
{
	public static void main(String[] args) 
	{
	      TransportFactory obj = new TransportFactory();
	      Transport transportType1 = obj.getTransport("AUTO");
	      transportType1.getRide();
	      Transport transportType2 = obj.getTransport("CAR");
	      transportType2.getRide();
	      Transport transportType3 = obj.getTransport("BIKE");
	      transportType3.getRide();
	 }
}