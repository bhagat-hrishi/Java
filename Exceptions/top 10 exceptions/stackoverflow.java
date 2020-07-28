/**
 * It is child of Error so unchecked 
 * Whenever we are trying to invoke recursive
 * method call JVM will raise StackOverFloeError automatically.
 */
class stackeoverflow
{
    static void m1()
    {
        m2();        
    }
    static void m2()
    {
        m1();
    }
    public static void main(String[] args) {
        m1();
    }
}