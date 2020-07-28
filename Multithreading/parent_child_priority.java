class child  extends Thread
{
    public void run()
    {
        System.out.println("C: "+Thread.currentThread().getPriority());
    }

}
/**
 * default priority of main Thread is 5
 * Whatever priority parent has by default child will have that priority
 * i.e. child priority same as parent priority (default)
 */
class parent_child_priority
{
    public static void main(String[] args) {
        System.out.println("Here By default parent and child priority are same");
        Thread.currentThread().setPriority(9);//priority set to 9
        child t=new child();
        t.start();
        System.out.println("P: "+Thread.currentThread().getPriority());
    }
}