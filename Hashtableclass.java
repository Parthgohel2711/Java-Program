import java.util.*;  
public class Hashtableclass
{
    public static void main(String p[])
    {
        Hashtable< String,String > hash=new Hashtable< String,String >();
        hash.put("Name","Loginius Infotech");
        hash.put("Address","205 , Opera Tower , Opp. Galexy Hotel , Rajkot");
        hash.put("Contact No","6359906666");
        hash.put("WORK","Development");
        System.out.println("Display HASHTABLE DATA : ");
        System.out.println(hash);
        hash.put("Address","205 , Opera Tower , Opp. Galexy Hotel , Near Trikon Baugh , Rajkot");
        System.out.println("UPDATE HASHTABLE DATA using key : ");
        System.out.println(hash);
        System.out.println("Display Data Using MAP : ");
        for(Map.Entry dir:hash.entrySet())
        {
            System.out.println("Key => "+dir.getKey()+" , Value => "+dir.getValue());
        }
        hash.remove("WORK");
        System.out.println("Display After Remove (WORK): \n"+hash);

    }
}
