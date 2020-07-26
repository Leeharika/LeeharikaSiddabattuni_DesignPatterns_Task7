package BridePattern;

public class Rectangle extends Shape 
{
	   private int x, y, length , breadth ;
	   public Rectangle(int x, int y, int length, int breadth, DrawAPI drawAPI) 
	   {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.length = length;
	      this.breadth = breadth;
	   }

	   public void drawRect() {
	      drawAPI.drawRectangle(length,breadth,x,y);
	   }
}