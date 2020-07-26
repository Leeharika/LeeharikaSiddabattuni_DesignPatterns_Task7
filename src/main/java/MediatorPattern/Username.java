package MediatorPattern;
public class Username 
{
	   private String name;

	   public String getName() 
	   {
	      return name;
	   }

	   public void setName(String name) 
	   {
	      this.name = name;
	   }

	   public Username(String name)
	   {
	      this.name  = name;
	   }

	   public void sendMessage(String message)
	   {
	      MailInfo.showMessage(this,message);
	   }
	}
