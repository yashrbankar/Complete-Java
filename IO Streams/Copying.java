import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copying 
{
    public static void main(String args[]) 
    {
        try{
            //! it throws the excetion if file is not present
            FileInputStream io= new FileInputStream("source.txt");
            //! creates if file is not present
            FileOutputStream out= new FileOutputStream("output.txt");
            int b;
            while((b=io.read())!=-1)
            {
                if(b>=65&&b<=90) out.write(b+32);
                else out.write(b);
            }
        }catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
