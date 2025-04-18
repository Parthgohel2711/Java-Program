class OverrideDemo
{
    public void Demo(int a)
    {
        System.out.println("This is Integer : "+a);
    }
}

class OverrideDemo2 extends OverrideDemo
{
    public void Demo(String a)
    {
        System.out.println("This is String : "+a);
    }
}

public class Override
{
    public static void main(String s[])
    {
       OverrideDemo2 O = new OverrideDemo2();
       O.Demo(5); 
       O.Demo("A");
    }
}