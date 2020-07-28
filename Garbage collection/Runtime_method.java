import org.omg.SendingContext.RunTime;
import java.util.*;

class Runtime_method
{
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        System.out.println("Total heap memory "+r.totalMemory());
        System.out.println("Total free memory "+r.freeMemory());
        for(int i=0;i<1000000;i++)
        {
            Date d=new Date();
            d=null;
        }
        System.out.println("Objects are eligible for GC present in Heap so reduction in free memory");
        System.out.println("Total heap memory " + r.totalMemory());
        System.out.println("Total free memory " + r.freeMemory());
        r.gc();
        System.out.println("Free memory after running gc method "+r.freeMemory());
        System.gc();
    }
}