import java.util.*;

public class StringTockenizerclass
{
    public static void main(String s[])
    {
        StringTokenizer ST = new StringTokenizer("Hello World");
        System.out.println(ST.countTokens());
        while(ST.hasMoreTokens())
        {
            System.out.println(ST.nextToken());
        }
    }

}