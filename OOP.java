public class OOP
{
    public static void main(String[] args)
    {
        System.out.println("---All OOP Concepts As Per Syllabus---");
        System.out.println("Encapsulation,Inheritance,Polymorphism Is A Class");
        System.out.println("E Is A Object of Inheritance Class");
        //Encapsulation  is Class      
        //E is Object
        Inheritance E = new Inheritance();
        E.set("This Is Example Of OOP Encapsulation");
        E.get();
        E.InheritadData();

        Polymorphism P = new Polymorphism();
        P.Polymorphism1("This Is Example Of OOP Polymorphism");
        P.Polymorphism1(10);
    }
}

class Encapsulation 
{
    // Example Of Encapsulation
    private String a;
    public String get()
    {
        return a;
    }
    public void set(String a)
    {
        this.a = a;
        System.out.println(a);
    }
}

class Inheritance extends Encapsulation
{
    public void InheritadData()
    {
        System.out.println("This Is Example Of OOP Inheritance");
    }
}

class Polymorphism 
{
    public void Polymorphism1(String a)
    {
        System.out.println(a);
    }
    public void Polymorphism1(int a)
    {
        System.out.println(a);
    }
}

/* Output
Encapsulation,Inheritance,Polymorphism Is A Class
E Is A Object of Inheritance Class
This Is Example Of OOP Encapsulation
This Is Example Of OOP Inheritance  
This Is Example Of OOP Polymorphism 
10
 */