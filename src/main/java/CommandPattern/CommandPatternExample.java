package CommandPattern;

public class CommandPatternExample {
	   public static void main(String[] args) {
	      Food abcStock = new Food();

	      TakeOrder takeOrder = new TakeOrder(abcStock);
	      Deliver deliverOrder = new Deliver(abcStock);

	      Server server = new Server();
	      server.takeOrder(takeOrder);
	      server.takeOrder(deliverOrder);

	      server.placeOrders();
	   }
	}
