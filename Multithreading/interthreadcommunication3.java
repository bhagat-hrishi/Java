class ThreadB extends Thread // this thread performing updation so called notify method
{
    int tot = 0;

    public void run() {
        synchronized (this) {
            /* 1 */System.out.println("child thread start calculation");
            for (int i = 1; i <= 100; i++) {
                tot += i;
            }
            /* 2 */System.out.println("Child thread trying to give notification");
            /* 3 */this.notify();// notify method
        }

    }

}

// Run this code and see o/p and also analyse
// most of time main thread get chance according to that flow indicated by
// numbers
class interthreadcommunication3 // this thred expecting updation so called wait method
{
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(10000);
        synchronized (b) {
            /* 4 */System.out.println("main thread trying to call wait method");
            //Problem in interthreadcommunication2.java solved in just below statement
            b.wait(10000);//main therad wait only for 10 sec if not notificaion came then rest of code is executes
            // after calling this main thread go into waiting state
            //here thread does not get noification only executed rest of part present below
            /*5*/System.out.println(b.tot);

        }
    }
}