package BridePattern;

public class BlueRectangle implements DrawAPI {
	   @Override
	   public void drawRectangle(int length, int breadth, int x, int y) 
	   {
	      System.out.println("Drawing Rectangle[ color: Blue, area: " + length*breadth + ", x: " + x + ", " + y + "]");
	   }
	}