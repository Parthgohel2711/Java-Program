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
public class innerclass 
{
    public static void main(String s[])
    {
        A.B b = new A().new B();
        A a = new A();
        b.data();
        a.demo();
    }
}