public class SynchronizedThreadclass
{
    public static void main(String p[]) 
    {
        Thr t=new Thr();
        Sync s=new Sync("One", t);
        Sync s1=new Sync("Two", t);
        Sync s2=new Sync("Three", t);
    }
}
class Thr 
{
   synchronized void disp(String msg)
   {
    System.out.print ("["+msg);
       try
       {
           Thread.sleep(1000); 
       }
       catch(Exception e)
       {
           System.out.println("Exception:"+e.getMessage());
       }
       System.out.print ("]");
   }
    
}
class Sync extends Thread
{
    String msg;
    Thr t;
    Sync(String msg,Thr t)
    {
        this.msg=msg;
        this.t=t;
        start();
    }
    public void run()
    {
       t.disp(msg);
        
    }
}