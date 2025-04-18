public class ConstructorOverloading
{
    ConstructorOverloading(int a)
    {
        int x = a;
        System.out.println("Integer : "+x);
    }

    ConstructorOverloading(String a)
    {
        String x = a;
        System.out.println("String : "+x);
    }

    public static void main(String s[])
    {
        ConstructorOverloading C = new ConstructorOverloading(5);
        ConstructorOverloading C1 = new ConstructorOverloading("A");

        

        
    }
}