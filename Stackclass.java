import java.util.*;
public class Stackclass
{
    public static void main(String p[])
    {
        Stack< String > st=new Stack<>();
        st.push("This");
        st.push("is");
        st.push("Data");
        st.push("of");
        st.push("Stack");
        st.push("Collection");
        System.out.println("Display Data : ");
        System.out.println(st);
        System.out.println("Remove last Data (pop) : ");
        st.pop();
        System.out.println(st);
        String data=st.peek();
        System.out.println("Peek Data is : "+data);
        System.out.println("Empty : "+st.empty());
        System.out.println("Size : "+st.size());
    }
}