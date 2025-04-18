
public class Loop
{
    public static void main(String s[])
    {
        int i=0;
        System.out.println("----For Loop----");
        for(i=0;i<=5;i++)
        {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("----While Loop----");
        i=0;
        while(i<=5)
        {
            System.out.print(i);
            i++;
        }
        System.out.println();
        System.out.println("----Do While Loop----");
        i=0;
        do
        {
            System.out.print(i);
            i++;
        }while(i<=5);
        System.out.println();
        System.out.println("----For Each Loop----");
        int[] j = {0,1,2,3,4,5};
        for (int k: j)
        {
            System.out.print(k);
        }
        System.out.println();
    }
}