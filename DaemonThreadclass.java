public class DaemonThreadclass
{
    public static void main(String p[]) throws Exception
    {
        Thread thread = new Deamon();
        Thread thread1 = new Deamon();
        Thread thread2 = new Deamon();
        thread.setDaemon(true);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
class Deamon extends Thread
{
    if(Thread.currentThread().isDaemon())
    {
        System.out.println("DAEMON THREAD WORK");
    }
    else{
        System.out.println("Normal Thread Work");
    }
}