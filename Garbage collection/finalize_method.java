/**
 * Just before destroying any object gc always calls finalize() method to perform cleanup activities.
 *   If the correspondoherwise Object class finalize() method will be executed.
 */
class finalize_method
{

    public static void main(String[] args) {
        String s=new String("WCE");
        finalize_method obj=new finalize_method();
        obj=null;//Object eligible for GC
        System.gc();
        System.out.println("Main end");
   }
    public void finalize()//This method is called by GC 
    {
        System.out.println("hello from Finalize method of class");
    }
}