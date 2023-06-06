
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        //! creating the priority<>
        setPriority(MIN_PRIORITY);
    }
    public void run()
    {
        int i=01;
        while(i>-10)
        {
            System.out.println("bye "+i);
            i--;
            
            try {
                //! it throughs the exceptions
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        } 
    }
};
class MyRun implements Runnable
{
    public void run()
    {
        int i=01;
        while(true)
        {
            System.out.println("hello "+i);
            i++;
        }
    }
}
public class ThreadsMethods 
{
    public static void main(String args[])
    {
       // Thread t =new Thread(new MyRun(),"My Name");
        //t.start();
        MyThread t2=new MyThread("Second Thread");
        t2.start(); 
        // it interrupts and cause the exception
        t2.interrupt();

        //! methods
        System.out.println("getId ::"+t2.getId());
        System.out.println("getName ::"+t2.getName());
        System.out.println("getPriority ::"+t2.getPriority());
        System.out.println("getState ::"+t2.getState());
        System.out.println("aLIVE ::"+t2.isAlive());
    }
}
