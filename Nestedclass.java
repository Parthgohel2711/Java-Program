class A 
{
    public void demo()
    {
        System.out.println("This is Demo");
    }
    class B 
    {
        public void data() 
        {
                System.out.println("This is Data");
        }
    }
}

public class Nestedclass 
{
    public static void main(String[] args) 
    {
        A a = new A();
        A.B b = a.new B();
        a.demo();
        b.data();
    }
}