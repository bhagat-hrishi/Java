class MyThread extends Thread {
    static Thread mt;//static variable of Thread Type

    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class waiting_of_child_until_complete_main{
    public static void main(String[] args) throws InterruptedException {
        MyThread.mt = Thread.currentThread(); //MyThread mt is assigned with main Thread reference
        //after this mt pointing to main Thread Object
        MyThread t = new MyThread();
        t.start();
        /*below t.join is indicate that main Thread is waiting for child Thread and in child it is also wait for main Thread 
        then program is hanged like deadlock
       
        */
        // t.join();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Main Thread");
        }
    }
}