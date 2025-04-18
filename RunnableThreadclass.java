public class RunnableThreadclass
{
    public static void main(String p[]) 
    {
        Thr t=new Thr();
        Thread t1=new Thread(t);
        t1.start();
    }
}
class Thr implements Runnable
{
    public void run()
    {
        System.out.println("Thread Of Thr Class Using Runnable.");
    }
}
