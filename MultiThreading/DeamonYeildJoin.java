


public class DeamonYeildJoin extends Thread
{
    public void run()
    {
        int count=0;
        while(true)
        {
            System.out.println("mythread + "+count++);
        }
    }
    public static void main(String args[]) throws InterruptedException
    {
        DeamonYeildJoin t=new DeamonYeildJoin();
        //* Daemon thread
        //t.setDaemon(true);//deamon thread 
        // as main thread terminated deamon thread also terminated 
        t.start();
        /* 
        ! sleeping the main thread for the 1sec 
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
        !when main thread exited deamon thread also exited
        */
        //* join
        //? now joining so it will wait
        // Thread mainThread=Thread.currentThread();//! finding the refernce
        // mainThread.join();
        //! main thread wait for daemon thread to complete 
        //* yeild
        int count=1;
        while(true)
        {
            System.out.println("main thread"+ count++);
            Thread.yield();
            //! make the thread slow 
            //! yeild gives extra time to other threads
            //! less preference is given to the main
            //! all the present threads
        } 
    }
}
