import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class AllCursors {
    public static void main(String[] args) {
        Vector v=new Vector<Integer>();
        for(int i=0;i<10;i++)
        {
            v.add(i+1);
        }
        //for Enumeration
        Enumeration<Integer> e=v.elements();
        System.out.println("\nBy enumration");
        while(e.hasMoreElements())//method of enumeration
        {
            //return type of nextElement method is Object so we need to do typecasting
            System.out.print((Integer)e.nextElement()+ "  ");//method of enumeration
        }

        //for Iterator
        Iterator<Integer> it=v.iterator();
        System.out.println("\nBy Iterator");
        while(it.hasNext())
        {
            //return type of next function is Object so we need to typecast
            Integer i=(Integer)it.next();
            if(i%2==0)
                System.out.print(i+ "  ");
            else
                it.remove();
        }

        //by ListIterator
        System.out.println("\nListIterator");
        ListIterator lst=v.listIterator();
        while(lst.hasNext())//listiterator is child interface of iterator so it has hasNext method
        {
            System.out.println("Element: "+lst.next()+"  "+lst.nextIndex());
        }
       
    }
}