//synchronized block to get lock of current Object
class Display {
    

    public void wish(String name)
    {
        //consider here 1 lakh line of code which can be executed by mutliple threads simaltaneously
    ;;;;;;;;;;;;;;;;;
    //if very few lines of code required synchronization then we should declare that code inside synchronizaion block
        synchronized (this) {

            for (int i = 0; i < 5; i++) {
                System.out.print("good morning:");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }

        }
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

public class synch_block1 {
    public static void main(String[] args) {
        Display d = new Display();
        //on same display Object both threads are exeucting
        MyThread t1 = new MyThread(d, "dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");
        t1.start();
        t2.start();
    }
    
}