/**
 * We can call finalize() method explicitly then it will be executed just like a
 * normal method call and object won't be destroyed. But before destroying any
 * object GC always calls finalize() method
 */
class explicit_call_finalize
{
    public static void main(String[] args) {
        explicit_call_finalize obj=new explicit_call_finalize();
        System.out.println("Explicit call");
        obj.finalize();//explicit call to finalize method
        System.out.println("Called by GC");
        obj=null;//Object eligible for GC
        System.gc();//Garbage collector will call finalize method
        System.out.println("End of main");
       
    }
    public void finalize()
    {
        System.out.println("Hello from finalize");
    }
}