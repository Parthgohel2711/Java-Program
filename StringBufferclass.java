import java.lang.*;

public class StringBufferclass
{
    public static void main(String s[])
    {
       StringBuffer s1 = new StringBuffer("Hello World");
       System.out.println(s1.append(" Parth"));
       System.out.println(s1.insert(0," Veer"));
       System.out.println(s1.replace(0,3,"Parth"));
       System.out.println(s1.delete(0,4));
       
    }
}