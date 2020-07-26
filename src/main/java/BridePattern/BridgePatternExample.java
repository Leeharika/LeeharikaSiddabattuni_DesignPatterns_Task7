package BridePattern;

public class BridgePatternExample 
{
	   public static void main(String[] args) 
	   {
	      Shape blueRectangle = new Rectangle(100,10, 10, 10, new BlueRectangle());
	      Shape blackRectangle = new Rectangle(100,10, 10, 10, new BlackRectangle());
	      blueRectangle.drawRect();
	      blackRectangle.drawRect();
	   }
}