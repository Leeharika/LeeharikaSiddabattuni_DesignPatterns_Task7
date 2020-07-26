package CommandPattern;
import java.util.ArrayList;
import java.util.List;

   public class Server {
   private List<Order> orderList = new ArrayList<Order>(); 

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.prepare();
      }
      orderList.clear();
   }
}