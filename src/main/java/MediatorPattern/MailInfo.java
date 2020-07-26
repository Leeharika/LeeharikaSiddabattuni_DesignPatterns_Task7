package MediatorPattern;
import java.util.Date;

public class MailInfo {
   public static void showMessage(Username username, String message){
      System.out.println(new Date().toString() + " [" + username.getName() + "] : " + message);
   }
}