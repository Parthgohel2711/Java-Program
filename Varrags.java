public class Varrags
{
    public static void main(String[] args)
    {
        //Multiple Argument Without Assgin
        var("This","Is");
        var("Example","Of","Variable");
        var("Length");
        var("Argument");
    }

    public static void var(String...n) 
    {
        for(String i : n) 
        {
            System.out.print(i + " "); 
        }
    }
}
/* Output 
This Is Example Of Variable Length Argument 
*/