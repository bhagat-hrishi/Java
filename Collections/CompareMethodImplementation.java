import java.util.Comparator;
import java.util.TreeSet;

class MyCompareDescending implements Comparator
{
    public int compare (Object obj1,Object obj2)
    {
        Integer i1=(Integer)obj1;
        Integer i2=(Integer)obj2;
        if(i1<i2)
            return 1;
        else if(i1>i2)
            return -1;
        else 
            return 0;
    }
}
class DescendingString implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=(String)obj1;
        String s2=(String)obj2;
        return - (s1.compareTo(s2));//by default compareTo do ascending order -ve to this give ans in descending order

    }
}
class AscendingStringBuffer implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        //convert Stringbuffer Object to String and use String method
        String s1=obj1.toString();
        String s2=obj2.toString();

        return s1.compareTo(s2);
    }
}

class IncreasingLengthStringAndStringBuffer implements Comparator 
{
    //Sorting order is increasing lenght Order 
    //if length is same then alhpabetical order
    public int compare(Object obj1,Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();

        int ln1=s1.length(),ln2=s2.length();
        
        if(ln1<ln2)
            return -1;
        else if(ln1>ln2)
            return +1;
        //if here code execution come means length is same
            //length is same  now do alphabetical order
        
     return s1.compareTo(s2);
        

    }
}
public class CompareMethodImplementation {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyCompareDescending());
        t.add(90);
        t.add(-1);
        t.add(0);
        t.add(100);
        t.add(50);
        t.add(-2);
        System.out.println("\nData in descending Order:");
        System.out.println(t);


        TreeSet s=new TreeSet(new DescendingString());
        s.add("hrishi");
        s.add("omkar");
        s.add("abcedsd");
        s.add("abzzzz");
        s.add("zzzz");

        System.out.println("\n________________");
        System.out.println(s);


        TreeSet sb=new TreeSet(new AscendingStringBuffer());
        sb.add(new StringBuffer("M"));
        sb.add(new StringBuffer("B"));
        sb.add(new StringBuffer("D"));
        sb.add(new StringBuffer("Z"));
        System.out.println("\n\nAscending:\n"+sb);


        //Adding String and StringBuffer Object and Sort by length
        //if same lenght then alphabetical order

        TreeSet StringStringBuffer =new TreeSet(new IncreasingLengthStringAndStringBuffer());
        StringStringBuffer.add("A");
        StringStringBuffer.add("A");
        StringStringBuffer.add(new StringBuffer("AA"));
        StringStringBuffer.add(new StringBuffer("AB"));
        StringStringBuffer.add("X");
        StringStringBuffer.add("xxxxxxx");
        StringStringBuffer.add("ABCD");
        StringStringBuffer.add("AACD");

        System.out.println("\nString and StringBuffer: \n"+StringStringBuffer);

    }
}