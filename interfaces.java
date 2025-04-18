interface Perent
{
    public void demo();
}

class Child implements Perent
{
    public void demo()
    {
        System.out.println("This Is Demo");
    }
}
public class interfaces
{
    public static void main(String[] args)
    {
        Child C = new Child();
        C.demo();
    }
}