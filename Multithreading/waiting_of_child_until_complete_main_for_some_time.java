class pract1  extends Thread
{
     static Thread  main_thread;
    public void run()
    {
        try
        {
            System.out.println("child wait for main for 1 second --------------------");
            main_thread.join(1000);//wait for main Thread for 1 second

        }
        catch(Exception e)
        {
            
        }
         System.out.println("Ok child execute -------------------");
        for(int i=0;i<5;i++)
            System.out.println("child");
    }
}
/**
here child wait for main Thread for 1 second by  but main Thread go into sleep for 2 seconds so 
after waiting for 1 second child Thread execute 
 */
class waiting_of_child_until_complete_main_for_some_time
{
    public static void main(String [] args) throws Exception
    {
        pract1.main_thread=Thread.currentThread();
        pract1 t=new pract1();
        t.start();
        System.out.println("main go to sleep --------------------");
        Thread.currentThread().sleep(2000);
         System.out.println("main out of sleep --------------------");
        for(int i=0;i<5;i++)
            System.out.println("main");
    }
}