public class  AccessSpecifiers
{
    
    public static void main(String[] args)
    {
        NewAccessSpecifiers A = new NewAccessSpecifiers();
        
        //Access Public AccessSpecifiers
        System.out.println(A.a);

        //Access Private AccessSpecifiers
        A.set("This is Access Private Member By Another Class");
        A.get();

        //Access Protected AccessSpecifiers
        System.out.println(A.c);
        
    }
}

class NewAccessSpecifiers
{
    public String a = "This is Access Public Member By Another Class" ;
    private String b;
    public void set(String b)
    {
        this.b = b;
        System.out.println(b);
    }
    public String get()
    {
        return b;
    }
    protected String c = "This is Access Protected Member By Another Class";
}