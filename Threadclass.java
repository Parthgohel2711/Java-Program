public class Threadclass
{
    public static void main(String p[]) 
    {
        Thr t=new Thr();
        t.start();
    }
}
class Thr extends Thread
{
    public void run()
    {
        System.out.println("Thread Of Thr Class is Running...");
    }
}
