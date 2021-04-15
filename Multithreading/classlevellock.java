class Display
{
    public void wish(String name)
    {
        //1 lack line of code
        synchronized (Display.class)//class level  lock 
        {
            for(int i=0;i<10;i++)
            {
                System.out.print("Good morning ");
                try 
                {
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {

                }
                System.out.println(name);
            }
        }
        //1 lack line of code
    }
}
class MyThread  extends Thread
{
    Display d;
    String name;
    MyThread(Display d,String s)
    {
        this.d=d;
        this.name=s;
    }
    public void run()
    {
        d.wish(name);
    }
}
class classlevellock
{//GET regular o/p
    //different thread operate on different object but class level lock is aquired so regular o/p
    public static void main(String[] args) {
        Display d1=new Display();
        Display d2=new Display();
        MyThread t1=new MyThread(d1, "dhoni");
        MyThread t2 = new MyThread(d2, "Yuvraj");
        t1.start();
        t2.start();
    }
    //check o/p
}