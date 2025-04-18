public class UDFExceptionclass
{
    public static void main(String p[])  
    {
        try
        {
            int age=0;
            if(age<=17)
            {
                throw new ErrorException("You are Not eligible.");
            }
            else
            {
                    System.out.println("You Are eligible.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }
}
class ErrorException extends Exception{
    ErrorException(String s)
    {
        super(s);
    }
}
