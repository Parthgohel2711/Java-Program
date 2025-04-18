import java.io.*;
public class CreateFile
{
    public static void main(String p[])
    {
        try {
            File f=new File("d://createFile.txt");
            if(f.createNewFile())
            {
                System.out.println("File Created.");
            }
            else
            {
                System.out.println("File Already Exist.");
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}