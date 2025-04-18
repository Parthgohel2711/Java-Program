import java.util.*;
public class SortedSetclass
{
    public static void main(String p[])
    {
        SortedSet ss=new TreeSet();
        ss.add("This");
        ss.add("is");
        ss.add("Data");
        ss.add("of");
        ss.add("a");
        ss.add("SortedSet");
        System.out.println(ss);
        System.out.println("Display using loop : ");
        for(Object o:ss)
        {
            System.out.println(o);
        }
    }
}

    