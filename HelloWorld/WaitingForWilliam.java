/**
 * Program designed to print time and refresh every second.
 * @author (Seay Zagar)
 * @version (2.0)
 */
import java.util.*;
import java.awt.event.KeyEvent;
public class WaitingForWilliam
{
   static int x = 0;
   public static void main()
   {
      int millis, second, minute, hour;
      int x = 0;
      System.out.print("\f");
      System.out.println("Initiating...");
      try
      {
         Thread.sleep(1000);
         x++;
      }
      catch(InterruptedException e){}
      while(x < 5000)
      {//five seconds
         try
         {
            Thread.sleep(1);
            x++;
         }
         catch(InterruptedException e){}
         System.out.print("\f");
         
         GregorianCalendar now = new GregorianCalendar();
         millis = now.get(Calendar.MILLISECOND);
         second = now.get(Calendar.SECOND);
         minute = now.get(Calendar.MINUTE);
         hour   = now.get(Calendar.HOUR);
         
         System.out.println(+hour+":"+minute+":"+second+":"+millis);
      }
      System.out.print("\f");
      System.out.println("Done");
      try
      {
         Thread.sleep(2000);
      }
      catch(InterruptedException e){}
      System.out.print("\f");
      System.out.println("William");
      try
      {
         Thread.sleep(1500);
      }
      catch(InterruptedException e){}
      System.out.print("\f");
      System.out.println("Are you there?");
   }
   public void keyTyped(KeyEvent e) 
   {
      if (e.getKeyCode() == 81) 
      {
         x = 5000;
         System.out.println("William");
      }
   }
}