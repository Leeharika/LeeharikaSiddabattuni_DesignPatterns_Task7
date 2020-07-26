package CommandPattern;

public class Deliver implements Order {
	   private Food abcStock;

	   public Deliver(Food abcStock){
	      this.abcStock = abcStock;
	   }

	   public void prepare() {
	      abcStock.deliver();
	   }
	}
