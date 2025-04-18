class perent
{
    int a = 5;
}

class child extends perent
{
    int b = 6;
}

public class Inharitance
{
    public static void main(String s[])
    {
        child c =  new child();
        System.err.println("First Number  :"+(c.a));
        System.err.println("Second Number :"+(c.b));
    }
}