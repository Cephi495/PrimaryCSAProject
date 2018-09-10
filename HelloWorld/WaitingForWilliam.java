/**
 * Program designed to print time and refresh every second.
 * @author (Seay Zagar)
 * @version (2.0)
 */
import java.util.*;
class WaitingForWilliam
{
   public static void main()
   {
      int millis, second, minute, hour;
      int x = 0;
      System.out.print("\f");
      System.out.println("Initiating...");
      try{
             Thread.sleep(1000);
             x++;
            }
         catch(InterruptedException e){}
      while(x < 5000){//five seconds
         try{
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
      try{
             Thread.sleep(2000);
             x++;
            }
         catch(InterruptedException e){}
      System.out.print("\f");
      System.out.println("William");
      try{
             Thread.sleep(1500);
             x++;
            }
         catch(InterruptedException e){}
      System.out.print("\f");
      System.out.println("Are you there?");
   }
}