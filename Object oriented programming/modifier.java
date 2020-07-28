// Synchronized, strictfp, modifiers won't keep any restrictions on overriding.
class parent 
{
    synchronized void m1()
    {
        System.out.println("I am synchronozed m1");
    }
    strictfp void m3()
    {
        System.out.println("I am strictfp m3");
    }
}
class modifier extends parent
{
    void m1()
    {
        System.out.println("Normal m1");
    }
    void m3()
    {
        System.out.println("Normal m3");
    }
    public static void main(String[] args) {
        
    }

}