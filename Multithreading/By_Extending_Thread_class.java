class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class By_Extending_Thread_class
{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start(); 
        /*
         * t.start() method is responsible for creation of new thread
         * which is responsible execution of run method
         * if we replace t.start() by t.run() no new thread is created 
         * and run() method execute like normal method 
         */
        t.start();
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
