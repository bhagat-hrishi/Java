import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
    String name;
    int eid;

    Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public String toString() {
        return name + " ==> " + eid+"\n";
    }

    //Defining natural sorting Order by using compareTo
    public int compareTo(Object obj)
    {
        int eid1 = this.eid;
        Employee tmp = (Employee) obj;

        int eid2 = tmp.eid;
        if (eid1 < eid2)// less should come first
            return -1;
        else if (eid1 > eid2)
            return +1;
        else
            return 0;

    }

}


//New Sorting Order
class CustomizedSorting  implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Employee E1=(Employee)obj1;
        Employee E2=(Employee)obj2;
        
        //sort by ascending Order of name
        String s1=E1.name;
        String s2=E2.name;
        return s1.compareTo(s2);
    }
}
public class ComparableAndComparatorDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Hrishi1");
        Employee e2 = new Employee(2, "Omkar");
        Employee e3 = new Employee(3, "Tejas");
        Employee e4=new Employee(4, "cdcdcd");
        Employee e5=new Employee(5, "aeec");

        //Default natural Sorting order by so compareTo method called
        TreeSet t1=new TreeSet();
        
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);

        
        TreeSet t2=new TreeSet(new CustomizedSorting());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println("\n____________\nby Ascending Order of name\n"+t2);
    }
}
