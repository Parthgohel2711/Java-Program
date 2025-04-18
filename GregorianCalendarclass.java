import java.util.*;

public class GregorianCalendarclass
{
    public static void main(String s[])
    {
        GregorianCalendar G = new GregorianCalendar();
        System.out.println(G.getTime());
        System.out.println("Hour of Day : "+G.get(Calendar.HOUR_OF_DAY));
        System.out.println("Date       : "+G.get(Calendar.DATE));
        System.out.println("Minute     : "+G.get(Calendar.MINUTE));
        System.out.println("Timezone   : "+G.getTimeZone().getDisplayName());
       
    }
}