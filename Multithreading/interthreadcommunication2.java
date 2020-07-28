class ThreadB extends Thread //this thread performing updation so called notify method
{
    int tot=0;
    public void run()
    {
        synchronized(this)
        {
            /*1*/System.out.println("child thread start calculation");
                for (int i = 1; i <= 100; i++) {
                tot += i;
            }
            /*2*/System.out.println("Child thread trying to give notification");
            /*3*/this.notify();//notify  method
        }
            
    }
  
}
//Run this code and see o/p and also analyse
//most of time main thread get chance according to that flow indicated by numbers
/*
  As main thread get chance but main sleep for 10 sec then child start
  calculation after child send notification after that main thread is waiting
  so we get o/p as 
  child thread start calculation 
  Child thread trying to give
  notification main thread trying to call wait method
AND program is stucked here only  
  */
class interthreadcommunication2 //this thred expecting updation so called wait method
{
    public static void main(String[] args) throws InterruptedException
     {
    ThreadB b=new ThreadB();
    b.start();
    Thread.sleep(10000);
    System.out.println("main thread come out of sleep");
    synchronized(b)
    {
        /*4*/System.out.println("main thread trying to call wait method");
        b.wait();//after calling this main thread go into waiting state
        /*5(not execute)*/System.out.println("main thread got notificaion ");//as thread not get any notification
        /*6(not execute)*/System.out.println(b.tot);
        
    }       
    }
}