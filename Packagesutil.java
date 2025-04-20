import java.util.*;

public class Packagesutil
{
    public static void main(String[] args)
    {
        //Random Package
        System.out.println("---This Is Random Package---"+"\n");
        Random r = new Random();
        System.out.println("The Random Number : "+r.nextInt()+"\n");

        //Date Package
        System.out.println("---This Is Date Package---"+"\n");
        Date d = new Date();
        System.out.println("The Date Is       : "+d+"\n");

        //GregorianCalender Package
        System.out.println("---This Is GregorianCalendar Package---"+"\n");
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("The Time Is       : "+gc.getTime()+"\n");
        
        //StringTokenzier Package
        System.out.println("---This Is StringBuffer Package---"+"\n");
        StringTokenizer st = new StringTokenizer("Parth","Gohel");
        System.out.println("Tocken Is         : "+st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println("Name Is           : "+st.nextToken()+"\n");
        }
    }
    
}

/*
---This Is Random Package---

The Random Number : -666401035

---This Is Date Package---    

The Date Is       : Sun Apr 20 17:32:22 IST 2025

---This Is GregorianCalendar Package---

The Time Is       : 1745150542161

---This Is StringBuffer Package---

Tocken Is         : 1
Name Is           : Part
 */