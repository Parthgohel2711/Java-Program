public class Exceptionclass
{
    public static void main(String p[])
    {
        try
        {
            int a=100;
            System.out.println("DIV ="+(a/0));
        }
        catch(Exception e)
        {
            System.out.println("Div By Zero Exception.");
        }
    }
}