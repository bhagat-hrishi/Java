class Mythread extends Thread
{
    public void run()
    {
        
        System.out.println("I am run method");
        System.out.println(Thread.currentThread().getName());
    }
    public void start()
    {
        super.start();
        System.out.println("start: " + Thread.currentThread().getName());
        System.out.println("I am start");
        System.out.println("start: "+Thread.currentThread().getName());
    }

}

/**
 * If we override start() method then our start() method will be executed just
 * like a normal method call and no new Thread will be started.
 */
class overriding_of_start
{
    public static void main(String[] args) {
        Mythread t=new Mythread();
        System.out.println("main: "+Thread.currentThread().getName());
        t.start();
    }
}