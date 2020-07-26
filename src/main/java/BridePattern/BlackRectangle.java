package BridePattern;

public class BlackRectangle implements DrawAPI {
	   @Override
	   public void drawRectangle(int length, int breadth, int x, int y) 
	   {
	      System.out.println("Drawing Rectangle[ color: Black, area: " + (length*breadth) + ", x: " + x + ", " + y + "]");
	   }
	}
