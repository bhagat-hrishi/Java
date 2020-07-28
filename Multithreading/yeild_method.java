/*
yeild method() Cause “to pause current executing Thread for giving the chance
of remaining waiting Threads of same priority".

 */
class child1 extends Thread 
{
    public void run()
    {
        for(int i=0;i<15;i++){
            
            System.out.println("P: "+Thread.currentThread().getPriority()+" Child1 ");
        }

    
    }
    
}
/** 
 * Thread2 calling yeild() method so chance of fast execution other Threads
 * are more
*/
class child2 extends Thread {
    public void run() {
        for (int i = 0; i <15; i++) {
            Thread.yield();// Give chance to other thread of same priority
            System.out.println("P: " + Thread.currentThread().getPriority() +" Child2 ");
        }

    }

}

class child3 extends Thread {
    public void run() {
        for (int i = 0; i <15; i++) {

            System.out.println("P: " + Thread.currentThread().getPriority() +" Child3 ");
        }

    }

}
class yeild_method 
{
    public static void main(String [] args)
    {
        child1 t1=new child1();
        child2 t2=new child2();
        child3 t3=new child3();
        t1.start();
        t2.start();
        t3.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("P: " + Thread.currentThread().getPriority() +" I am parent ");
        }

    }
}