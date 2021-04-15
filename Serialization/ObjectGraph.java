
/**
 * Whenever we are serializing an object the set of all objects which are
 * reachable from that object will be serialized automatically. This group of
 * objects is nothing but object graph in serialization.
 * 
 * In object graph every object should be Serializable otherwise we will get runtime exception saying"NotSerializableException".
 */
import java.io.*;
 
class I_am_rechable2 implements Serializable 
{
    int a=90;
    int b=23;
}
class I_am_rechable1 implements Serializable 
{
    I_am_rechable2 obj2=new I_am_rechable2();
}
class I_will_serelize implements Serializable 
{
    I_am_rechable1 obj1=new I_am_rechable1();
}
public class ObjectGraph {
  public static void main(String[] args)throws Exception {
      I_will_serelize obj = new I_will_serelize();

      FileOutputStream fos = new FileOutputStream("abc.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);

      FileInputStream fis = new FileInputStream("abc.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);

      I_will_serelize iam_object = (I_will_serelize) ois.readObject();
      //here we are serelizing I_will_serelizable object but all rechable object from this such as I_will_rechable1 and I_will_rechable2
      //also get serelizable
      System.out.println(iam_object.obj1.obj2.a + "_____________" + iam_object.obj1.obj2.b);
  }
}