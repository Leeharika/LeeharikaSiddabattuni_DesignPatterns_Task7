package FactoryPattern;
public class TransportFactory 
{
	public Transport getTransport(String transportType){
	      if(transportType == null)
	      {
	         return null;
	      }		
	      if(transportType.equalsIgnoreCase("AUTO")){
	         return new Auto();
	         
	      } 
	      else if(transportType.equalsIgnoreCase("CAR"))
	      {
	         return new Car(); 
	      } 
	      else if(transportType.equalsIgnoreCase("BIKE"))
	      {
	         return new Bike();
	      }
	      
	      return null;
	   }

}