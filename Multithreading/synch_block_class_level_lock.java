//synchronized block to get class level lock
//synchronized block to get lock of current Object
class Display {
    

    public void wish(String name)
    {
        //consider here 1 lakh line of code which can be executed by mutliple threads simaltaneously
    ;;;;;;;;;;;;;;;;;
    System.out.println("before synchronized block");
    //if very few lines of code required synchronization then we should declare that code inside synchronizaion block
        synchronized (Display.class) {//class level lock

            for (int i = 0; i < 5; i++) {
                System.out.print("good morning:");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }

        }
        System.out.println("After synchronized block");
        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    // consider here 1 lakh line of code which can be executed by mutliple threads simaltaneously
    }
    
    
    
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String s) {
        this.d = d;
        this.name = s;
    }

    public void run() {
        d.wish(name);
    }
}
public class synch_block_class_level_lock {
    public static void main(String[] args) {
        Display d = new Display();
        // on same display Object both threads are exeucting
        //even though both threads are executing different display objects but they need class level lock to execute so here at a time one
        //thread exexute i.e. if one thread get class level lock then other thread has to wait until complete of synchronized block code of  that thread
        MyThread t1 = new MyThread(d, "dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");
        t1.start();
        t2.start();
    }
}