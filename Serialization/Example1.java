import java.io.*;
class SerelizaitionDemo  implements Serializable
{ 
    int i = 10;
    int j = 20;
}
class Example1
{
    /**
     * Serelization 
     * The process of saving (or) writing state of an object to a file is called
     * serialization
     */
    
    public static void main(String[] args)throws Exception {
        SerelizaitionDemo obj1=new SerelizaitionDemo();

        System.out.println("Serelization started");
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        System.out.println("Serialization ended");

        System.out.println("Deserialization started");
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerelizaitionDemo d2 = (SerelizaitionDemo) ois.readObject();
        System.out.println("Deserialization ended");
        System.out.println(d2.i + "................" + d2.j);
    }
}