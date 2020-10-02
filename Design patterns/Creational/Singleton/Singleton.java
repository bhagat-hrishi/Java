/**
 
    1)Constructor is private or protected

 */
public class Singleton{

    private static Singleton iAmInstance;

    // Private constructor of singleton class
    // We cannot instaniate this class from outside 
    private Singleton()
    {

    }


    // Function return singleton class instance
    public static Singleton getInstance()
    {
            if(iAmInstance==null)
            {
                iAmInstance=new Singleton();
            }
            return iAmInstance;
    }

    public static void main(String[] args) {
        
    }
}
