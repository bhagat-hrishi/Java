class Thread1 extends Thread
{
   
    public void run()
    {

        for(int i=0;i<5;i++)
            System.out.println("Thread1");

    }
}
class Thread2 extends Thread
{
    static Thread t_hold_1;
    public void run() {
        try
        {
            t_hold_1.join();//as t_hold_1 contain thread 1
        }
        catch(Exception e)
        {

        }
        for (int i = 0; i < 5; i++)
            System.out.println("Thread2");

    }

}
/**
 *Here main thread is waiting for Thread2 to execute by calling t2.join() and thread2 is waiting 
 for Thread1 to execute by calling t_hold_1.join() as t_hold_1 refer Thread1
 so 1st Thread1 execute and then Thread2 and then main
 */
class join_method
{
    //join method throw InterruptedException which is checked so we must handle it
    public static void main(String[] args)throws InterruptedException
    {
        Thread1 t1=new Thread1();
        Thread2.t_hold_1=t1;
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        t2.join();
        for(int i=0;i<5;i++)
            System.out.println("main");
    }
}