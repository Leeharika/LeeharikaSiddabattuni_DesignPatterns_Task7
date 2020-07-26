package SingletonPattern;
public class SingletonObject 
{
	   private static SingletonObject obj = new SingletonObject();
	   private SingletonObject(){}
	   public static SingletonObject getObj()
	   {
	      return obj;
	   }

	   public void showMessage()
	   {
	      System.out.println("This program is an example of Singleton Design Pattern");
	   }
}
