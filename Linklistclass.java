import java.util.*;  
public class Linklistclass
{
    public static void main(String p[])
    {
        LinkedList< String > lnklst=new LinkedList< String >();
        lnklst.add("This");
        lnklst.add("is");
        lnklst.add("LINKEDLIST");
        lnklst.add("EXAMPLE");
        lnklst.remove("is");
        System.out.println("Display Data using ITERATOR : ");
        Iterator< String > move=lnklst.iterator();
        while(move.hasNext())
        {
            System.out.println(move.next());
        }

        System.out.println("Remove EXAMPLE from the LinkedList : ");
        lnklst.remove("EXAMPLE");
        System.out.println(lnklst);
        System.out.println("Display in DESC ORDER : ");
        Iterator< String > move1=lnklst.descendingIterator();  
        while(move1.hasNext())
        {
            System.out.println(move1.next());
        }
    }
}