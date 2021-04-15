class MyThread extends Thread {

    MyThread(ThreadGroup g, String name) {
        
        //calling Thread class constructor
        super(g, name);
    }
    public void run() {
        System.out.println("From Run method Child Thread");
    try {
        Thread.sleep(2000);
    }
        catch (InterruptedException e) {}
    }
}
class  Thread_Group_Methods2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg, "Child Group");
        MyThread t1 = new MyThread(pg, "Child Thread 1");
        MyThread t2 = new MyThread(pg, "Child Thread 2");
        t1.start();
        t2.start();
        //no of all threads 
        System.out.println("Active Therds :"+pg.activeCount());
        //total no of groups
        System.out.println("Active Groups: "+pg.activeGroupCount());

        System.out.println("\n_________________\nList:\n");
        //Prints Information about ThreadGroup to the Console.
        pg.list();
        System.out.println("\n____________\n");
        
        //main Thread sleep for 5 seconds until that both child thread 1 and 2 sleep for 3 seconds
        //and finish there execution after that both threds dead
        Thread.sleep(5000);
        
        System.out.println("Active Therds :"+pg.activeCount());
        System.out.println("\n_________________\nList:\n");
        pg.list();
        System.out.println("\n____________\n");
    }
}