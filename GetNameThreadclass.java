public class GetNameThreadclass
{
    public static void main(String p[]) 
    {
        Thr t=new Thr();
        Thread t1=new Thread(t);
        t1.start();
        String name=t1.getName();
        System.out.println(name);
    }
}
class Thr implements Runnable
{
    public void run()
    {
        System.out.println("Thread Executed.");
    }
}