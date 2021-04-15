/**
1)Whenever we are calling interrupt() method we may not see the effect
immediately, if the target Thread is in sleeping or waiting state it will be
interrupted immediately.
2) If the target Thread is not in sleeping or waiting state then interrupt call will
wait until target Thread will enter into sleeping or waiting state. Once target
Thread entered into sleeping or waiting state it will effect immediately.
3)In its lifetime if the target Thread never entered into sleeping or waiting state
then there is no impact of interrupt call simply interrupt call will be wasted.
 */
class child implements Runnable 
{
    public void run() 
    {
        try{
            for(int i=0;i<5;i++)
            {   
               
                System.out.println("child");
                Thread.sleep(1000);//if we comment this line then thread not go to sleeping state and interrupt call is wasted
            }
        }
        catch(Exception e)
        {
            System.out.println("I got interrupted");
        }

    }
}
class main_thread_interrupt_child
{
    public static void main(String[] args) {
        child r=new child();
        Thread t=new Thread(r);
        t.start();
        t.interrupt();//main Thread interrupting child thread
        for(int i=0;i<5;i++)
        {
            System.out.println("main");
        }
    }
    
}