/*
=>We can perform cloning only for Cloneable objects.
=> An object is said to be Cloneable if and only if the corresponding class
implements Cloneable interface.
=>Cloneable interface present in java.lang package and does not contain any
methods. It is a marker interface where the required ability will be provided
automatically by the JVM.
 */
class clo_ne  implements Cloneable
{
    int i,j;
    public static void main(String[] args) throws CloneNotSupportedException{
        clo_ne obj1=new clo_ne();
        obj1.i=10;
        obj1.j=20;
        clo_ne obj2=(clo_ne)obj1;
        
        System.out.println(obj1+" "+obj2);
        System.out.println(obj1.i+"________________"+obj1.j);
        System.out.println(obj2.i + "________________" + obj2.j);
    }
}