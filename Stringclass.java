import java.lang.*;

public class Stringclass
{
    public static void main(String s[])
    {
       String s1 = "Hello World";
       String s2 = "Hello Parth";
       System.out.println(s1.length());
       System.out.println(s1.equals(s2));
       System.out.println(s1.replace("World","Parth"));
       System.out.println(s1.toUpperCase());
       System.out.println(s1.toLowerCase());
    }
}