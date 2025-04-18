public class Condition
{
    public static void main(String s[])
    {
        int a=7;
        int b=8;
        System.out.println("-----Simple If-----");
        if(a==7)
        {
            System.out.println("Ok");
        }
        System.out.println("-----Ledder If-----");
        if(a==7)
        {
            System.out.println("Ok");
        }
        else if(a==5)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println("-----If Else-----");
        if(a==7)
        {
            System.out.println("Ok");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println("-----If Else-----");
        if(a==7)
        {
            if(b==8)
            {
                System.out.println("Ok");
            }
        }
    }
}