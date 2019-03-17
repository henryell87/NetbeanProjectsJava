
package calendarpractice;
//import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Import java .util.*;
/**
 *
 * @author HENRYELL
 */
public class Calendarpractice {
    //private static Object format1;

   
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE,1);
    System.out.println(cal.getTime());
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    String formatted = format1.format(cal.getTime());
    System.out.println(formatted);
    
   }
}