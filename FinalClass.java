final class FC 
{
    public void printMessage() 
    {
        System.out.println("This is a final class.");
    }
}
public class FinalClass 
{
    public static void main(String[] args)
    {
        FC fc = new FC();
        fc.printMessage();
    }
}