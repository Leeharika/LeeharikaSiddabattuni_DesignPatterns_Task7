package CommandPattern;
public class Food {
	
	   private String name = "ABC";
	   private int quantity = 10;

	   public void takeOrder(){
	      System.out.println("Food [ Name: "+name+",Quantity: " + quantity +" ] order taken");
	   }
	   public void deliver(){
	      System.out.println("Food [ Name: "+name+",Quantity: " + quantity +" ] delivered");
	   }
	}