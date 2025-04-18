class Perent
{
    Perent()
    {
        System.out.println("This is Perent Constructor");
    }
}

class Child extends Perent
{
    Child()
    {
        System.out.println("This is Child Constructor");
    }
}


public class ConstructorInharitence
{
    public static void main(String[] args)
    {
        Child C = new Child();    
    }
    
}