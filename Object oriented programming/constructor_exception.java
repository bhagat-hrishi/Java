import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

class parent 
{
    parent() throws FileNotFoundException
    {
        System.out.println("I am parent");
    }
}
class constructor_exception extends parent
{
    constructor_exception() throws IOException
    {
        System.out.println("I am child");
    }
    public static void main(String[] args)
     {
        System.out.println("\n\nIf Parent class constructor throws some checked exception compulsory Child class");
        System.out.print("constructor should throw the same checked exception (or) its PARENT");

        System.out.println("\nhere child class throwing IOException which is parent of FileNotFoundException which is thrown by parent constructor");
    }
   
}