public class Throwsclass
{
    public static void main(String p[]) throws IndexOutOfBoundsException 
    {
        try
        {
            int a[]=new int[2];
            a[2]=10;
        }
        catch(Exception e)
        {
            System.out.println("Exception:IndexOut Of Bounds - "+e.getMessage());
        } 
    }
}