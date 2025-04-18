public class Throwclass
{
    public static void main(String p[])
    {
        try
        {
            throw new ArithmeticException("INVALID.");
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e.getMessage());
        } 
    }
}