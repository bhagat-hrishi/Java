class ThreadB extends Thread //this thread performing updation so called notify method
{
    int tot=0;
    public void run()
    {
        synchronized(this)
        {
            /*2*/System.out.println("child thread start calculation");
                for (int i = 1; i <= 100; i++) {
                tot += i;
            }
            /*3*/System.out.println("Child thread trying to give notification");
            /*4*/this.notify();//notify  method
        }
            
    }
  
}
//Run this code and see o/p and also analyse
//most of time main thread get chance according to that flow indicated by numbers
class interthreadcommunication1 //this thred expecting updation so called wait method
{
    public static void main(String[] args) throws InterruptedException
     {
    ThreadB b=new ThreadB();
    b.start();
    //most of time main thread got a chance
    synchronized(b)
    {
        /*1*/System.out.println("main thread trying to call wait method");
        b.wait();//after calling this main thread go into waiting state
        //as wait method is called by main thread so immediately releases lock and  it goes into waiting state

        /*5*/System.out.println("main thread got notificaion ");
        /*6*/System.out.println(b.tot);
        
    }       
    }
}