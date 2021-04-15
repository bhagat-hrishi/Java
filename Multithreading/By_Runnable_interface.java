/**
  Runnable interface contain only one method
  public void run()
  
  
    defintion of Runnable interface
    public interface java.lang.Runnable {
        public abstract void run();
    }
 */
class Runnableinterface implements Runnable 
{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread().getName());
    }
}
class By_Runnable_interface
{
    public static void main(String[] args) {
        Runnableinterface r=new Runnableinterface();
        Thread t=new Thread(r);
        t.start();
        
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName());

    }
}