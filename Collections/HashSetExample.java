import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet s=new HashSet();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add(null);//null insetion possible
        s.add(10);//hetrogenous Object insetion possible
        System.out.println(s.add("A"));//adding duplicate give false
        System.out.println("\n______________\n");
        System.out.println(s);

        System.out.println("\nLinkedHashSet:\n");
        //Linked HashSet in this insertion order preserved
        LinkedHashSet s1 = new LinkedHashSet();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add(null);// null insetion possible
        s1.add(10);// hetrogenous Object insetion possible
        System.out.println(s1.add("A"));// adding duplicate give false
        System.out.println("______________");
        System.out.println(s1);
    }
}