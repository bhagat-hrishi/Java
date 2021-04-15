
class Display {

    /**
     * Even though wish method is synchronized here t1 aquire lock of d1 and t2
     * aquire lock of d2 both aquire lock of different Objects and they can execute
     * simultaneously so we get irregular . so even though wish method is
     * synchrnoized we get irregular o/p 
     * Conclusion : If multiple threads are operating on multiple objects then there is no impact of Syncronization. If
     * multiple threads are operating on same java objects then syncronized concept
     * is required(applicable).
     */
    public  synchronized void wish(String name) {
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

public class objectlevellock_diff_objects {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "dhoni");
        MyThread t2 = new MyThread(d2, "Yuvraj");
        t1.start();
        t2.start();
    }
    
}