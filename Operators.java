public class Operators
{
    public static void main(String[] args)
    {
        System.out.println("\n---- Arithmetic Operator ----\n");

        int a = 5 , b = 1;
        System.out.println("Addition                      : "+(a+b));
        System.out.println("subtraction                   : "+(a-b));
        System.out.println("Multiplication                : "+(a*b));
        System.out.println("Division                      : "+(a/b));
        System.out.println("Moduls                        : "+(a%b));

        System.out.println("\n---- Relational Operator ----\n");

        System.out.println("Equals To                     : "+(a==b));
        System.out.println("Not Equals To                 : "+(a!=b));
        System.out.println("Greater Then                  : "+(a>b));
        System.out.println("Less Then                     : "+(a<b));
        System.out.println("Greater Then Or Equals To     : "+(a>=b));
        System.out.println("Less Then Or Equals To        : "+(a<=b));
        
        System.out.println("\n---- Boolean Operator ----\n");

        System.out.println("Equals To                     : "+(a==b));
        System.out.println("Not Equals To                 : "+(a!=b));
        System.out.println("Greater Then                  : "+(a>b));
        System.out.println("Less Then                     : "+(a<b));
        System.out.println("Greater Then Or Equals To     : "+(a>=b));
        System.out.println("Less Then Or Equals To        : "+(a<=b));
        System.out.println("Logical |                     : "+(a==5 && b==1));
        System.out.println("Logical &                     : "+(a==5 || b==0));
        System.out.println("Logical !                     : "+!(a==5 && b==1));

        System.out.println("\n---- Logical Operator ----\n");

        System.out.println("Logical &&                    : "+(a==5 && b==1));
        System.out.println("Logical ||                    : "+(a==5 || b==0));
        System.out.println("Logical !                     : "+!(a==5 && b==1));

        System.out.println("\n---- Bitwise Operator ----\n");

        System.out.println("Biwise &                      : "+(a&b));
        System.out.println("Biwise |                      : "+(a|b));
        System.out.println("Biwise ~                      : "+(~a));
        System.out.println("Biwise ^                      : "+(a^b));
        System.out.println("Biwise >>                     : "+(a>>2));
        System.out.println("Biwise <<                     : "+(a<<2));
        System.out.println("Biwise >>>                    : "+(a>>>2));

        System.out.println("\n---- Unary(Increment,Decrement) Operator ----\n");

        System.out.println("Increment Prefix              : "+(++a));
        System.out.println("Decrement Prefix              : "+(--a));
        System.out.println("Increment Postfix             : "+(a++));
        System.out.println("Decrement Postfix             : "+(a--));
        
        System.out.println("\n---- Assignment Operator ----\n");

        System.out.println("A = 1                         : "+(a=1));
        System.out.println("A += 1                        : "+(a+=1));
        System.out.println("A -= 1                        : "+(a-=1));
        System.out.println("A *= 1                        : "+(a*=1));
        System.out.println("A /= 1                        : "+(a/=1));
        System.out.println("A %= 1                        : "+(a%=1));
        System.out.println("A >>= 1                       : "+(a>>=1));
        System.out.println("A <<= 1                       : "+(a<<=1));
        System.out.println("A &= 1                        : "+(a&=1));
        System.out.println("A |= 1                        : "+(a|=1));
        System.out.println("A ^= 1                        : "+(a^=1));
    }
}