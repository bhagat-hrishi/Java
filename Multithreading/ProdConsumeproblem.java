import java.util.*;

class ProducerandConsumer 
{
    LinkedList<Integer> l=new LinkedList<Integer>();
    int capacity=3;
    public void producer () throws InterruptedException
    {
        int value=0;
        while (true) {
            synchronized(this)
            {
                while (l.size() == capacity) {
                    System.err.println("producer is waiting");
                    wait();
                }
                System.out.println("Producer produced: " + value);
                l.add(value++);
                this.notify();
                Thread.sleep(1000);//after notifying producer go to sleep
            }
            
        }
       
    }
    public void consumer() throws InterruptedException
    {
        synchronized(this)
        {
            while (true) {
                if (l.size() == 0) {
                    System.out.println("consumer is waiting");
                    wait();
                }
                int val = l.removeLast();
                System.out.println("Consumer consumed: " + val);
                this.notify();
                Thread.sleep(1000);
            }
        }
        
    }
}
class ProdConsumerproblem 
{
    public static void main(String[] args) throws InterruptedException 
    {
        ProducerandConsumer pc=new ProducerandConsumer();
        Thread t1=new Thread(new Runnable(){
            public void run()
            {
                try {
                    pc.producer();
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            public void run() {
                try {
                    pc.consumer();
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }

        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}