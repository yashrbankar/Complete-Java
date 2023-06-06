
//! using different class 
/* 

class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
}

*/
//! using the same class
public class ThreadTest extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        ThreadTest t=new ThreadTest();
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++;
        }
    }
}
