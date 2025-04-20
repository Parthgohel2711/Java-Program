public class Inharitances
{
    public static void main(String[] args)
    {
        //Single Inharitance
        //Multilavel Inharitance
        //Hierarchical Inharitance
        //Multiple And Hybrid Not Suppoerted
        single2 s = new single2();
        s.singleInharitance1();
        s.singleInharitance2();

        multilavel3 m = new multilavel3();
        m.multilavelInharitance1();
        m.multilavelInharitance2();
        m.multilavelInharitance3();

        hierarchical2 h2 = new hierarchical2();
        h2.hierarchicalInharitance1();
        h2.hierarchicalInharitance2();

        hierarchical3 h3 = new hierarchical3();
        h3.hierarchicalInharitance3();
        hierarchical4 h4 = new hierarchical4();
        h4.hierarchicalInharitance4();
        
    }
}

class single1
{
    public void singleInharitance1()
    {
        System.out.print("This is Example OF");
    }
}

class single2 extends single1
{
    public void singleInharitance2()
    {
        System.out.println(" Single Inharitance");
    }
}

class multilavel1
{
    public void multilavelInharitance1()
    {
        System.out.print("This is");
    }
}

class multilavel2 extends multilavel1
{
    public void multilavelInharitance2()
    {
        System.out.print(" Example OF");
    }
}

class multilavel3 extends multilavel2
{
    public void multilavelInharitance3()
    {
        System.out.println(" MultiLavel Inharitance");
    }
}

class hierarchical1
{
    public void hierarchicalInharitance1()
    {
        System.out.print("This Is");
    }
}

class hierarchical2 extends hierarchical1
{
    public void hierarchicalInharitance2()
    {
        System.out.print(" Example");
    }
}

class hierarchical3 extends hierarchical1
{
    public void hierarchicalInharitance3()
    {
        System.out.print(" Of");
    }
}

class hierarchical4 extends hierarchical1
{
    public void hierarchicalInharitance4()
    {
        System.out.println(" Multiple Inharitance");
    }
}

/* Output
This is Example OF Single Inharitance    
This is Example OF MultiLavel Inharitance
This Is Example Of Multiple Inharitance  
 */