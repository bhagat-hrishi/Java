import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        //Elements are inserted according to  default natural sorting Order
        // "a"(97) > "A" (65)   
        /**
         * while adding null in "non empty" tree set we need to compare null with other elements so it is
         * null pointer exception
         * but we can add null in "empty tree set" at 1st insertion no need to compare null with any another 
         * element
         */
        t.add(null);// null insetion possible only once
        t.add("A");
        t.add("a");
        t.add("B");
        t.add("Z");
        t.add("c");
       // t.add(new Integer(90));//Heterogenous insetion not possible so error
        System.out.println(t);
       
   
       

    }
}