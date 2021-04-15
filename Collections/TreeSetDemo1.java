import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        /**
         * TreeSet uses default natural sorting Order and 
         * for default natural sorting Order JVM uses comparable interface which conatain only one method
         * compareTo which is used for default sorting order but StringBuffer "Does not" implement comprable 
         * interface so we get error
         * String class and All wrapper class uses comaprable interface
         */
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("D"));
    }
}