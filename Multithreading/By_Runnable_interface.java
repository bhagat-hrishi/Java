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
        t2.start();
        t.start();
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName());

    }
}