package MediatorPattern;
public class MediatorPatternExample 
{
	   public static void main(String[] args) 
	   {
	      Username user1 = new Username("leeharika9@gmail.com");
	      Username user2 = new Username("harika106@gmail.com");

	      user1.sendMessage("Hi! Leeharika.");
	      user2.sendMessage("Hello! harika,this is the remainder for you to submit the task.");
	   }
}