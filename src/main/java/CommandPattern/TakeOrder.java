package CommandPattern;

public class TakeOrder implements Order {
	   private Food abcStock;

	   public TakeOrder(Food abcStock){
	      this.abcStock = abcStock;
	   }

	   public void prepare() {
	      abcStock.takeOrder();
	   }
	}