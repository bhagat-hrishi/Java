
class Display {

    /**
     * As here wish method is synchronized so only one thread at a time can execute this method
     * t1 and t2 both thread want to execute method but which one will get chance depend upon JVM 
     * so either t1 get chance or t2 get chance first this depend upon JVM
     * so when one thread complete then only another thread will get chance
     * we can't expect which thread will get chance if multiple thread want to execute
     */
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("good morning:");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
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

class Objectlevellock_solution {
    // GET irregular o/p as differet thread operate on different current objects
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");
        t1.start();
        t2.start();
    }
    // check o/p
}