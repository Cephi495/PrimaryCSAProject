/**
 * Program designed to print time and refresh every second.
 * @author (Seay Zagar)
 * @version (1.10)
 */
import java.util.*;
class GetCurrentDateAndTime
{
   public static void main()
   {
      int millis, second, minute, hour;
      int x = 0;
      System.out.println("Initiating...");
      while(x < 10000){//ten seconds
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
   }
}