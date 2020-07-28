/**
 * If the programmer calls explicitly finalize() method and while executing the
 * finalize() method if an exception raised and uncaught then the program will
 * be terminated abnormally. If GC calls finalize() method and while executing
 * the finalize()method if an exception raised and uncaught then JVM simply
 * ignores that exception and the program will be terminated normally.
 */
class exception_in_finalize
{
    public static void main(String[] args) {
        exception_in_finalize obj=new exception_in_finalize();
        // obj.finalize();//if we comment this line then GC will call finalize method in this case uncaught exception is simply ignored
        obj=null;
        System.gc();
    
    }
    public void finalize()
    {
        System.out.println("hello from finalize");
        System.out.println(10/0);

    }
}