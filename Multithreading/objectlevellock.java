
class Display {
    public  void wish(String name) {
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

class objectlevellock {
    //GET irregular o/p as differet thread operate on different current  objects
    //run & check o/p
    public static void main(String[] args) {
        Display d=new Display();
        MyThread t1 = new MyThread(d, "dhoni");
        MyThread t2 = new MyThread(d, "Yuvraj");
        t1.start();
        t2.start();
    }
    //check o/p
}