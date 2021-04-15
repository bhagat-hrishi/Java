import java.io.*;

/**
 * • While performing serialization if we don't want to save the value of a particular variable to meet security 
 * constant such type of variable , then we should declare that variable with "transient" keyword.
 */
class Dog implements Serializable
{
    /* As static variable "does not" take part in serialization so decleraing static
     * variable as transient is "no use"*/
    static transient int i = 10;
    /**
     * as compile time only final variable is replaced by value so in serialization
     * it will take part as value so "no effect" here
     */
    final transient int j = 20;

    //for following default value of variable get stored so we get o/p as 0
    transient double d=3.45;
}
public class Example_With_Transcient 
{
    public static void main(String args[])throws Exception
    {
        Dog d1=new Dog();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println("\nfor as it is transcient then default value of variable is stored\n");
        System.out.println(d2.i+"................"+d2.j + "................." +d2.d);

    }
}