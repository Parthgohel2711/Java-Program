import java.lang.*;

public class Packageslang
{
    public static void main(String[] args)
    {
        //Math Package
        System.out.println("---This Is Math Package---"+"\n");
        System.out.println("Cail  : "+Math.ceil(5.7));
        System.out.println("Min   : "+Math.min(5,7));
        System.out.println("Max   : "+Math.max(5,7));
        System.out.println("Max   : "+Math.pow(2,3));//2*2*2
        System.out.println("Max   : "+Math.sqrt(25)+"\n");

        //Wrapper Package
        System.out.println("---This Is Wrapper Package---"+"\n");
        Integer a = 10;
        Character b = 'P';
        System.out.println("Integer   : "+a+"\n"+"character : "+b+"\n");

        //String Package
        System.out.println("---This Is String Package---"+"\n");
        String s = "Parth";
        System.out.println("String    : "+s);
        System.out.println("Charat    : "+s.charAt(0));
        System.out.println("Lower     : "+s.toLowerCase());
        System.out.println("Upper     : "+s.toUpperCase()+"\n");

        //StringBuffer Package
        System.out.println("---This Is StringBuffer Package---"+"\n");
        StringBuffer sb = new StringBuffer("Parth");
        System.out.println("String    : "+sb);
        System.out.println("String    : "+sb.insert(0,"Gohel"));
        System.out.println("String    : "+sb.delete(0,5)+"\n");
    }

}

/* 
---This Is Math Package---

Cail  : 6.0
Min   : 5  
Max   : 7  
Max   : 8.0
Max   : 5.0

---This Is Wrapper Package---

Integer   : 10
character : P

---This Is String Package---

String    : Parth
Charat    : P
Lower     : parth
Upper     : PARTH

---This Is StringBuffer Package---

String    : Parth
String    : GohelParth
String    : Parth
*/