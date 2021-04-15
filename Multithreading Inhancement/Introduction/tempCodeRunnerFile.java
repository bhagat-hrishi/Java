public class Thread_Group_Priority
{
    public static void main(String[] args) {
        //Creating G1 as ThreadGroup
        ThreadGroup g1=new ThreadGroup("G1");
        
        Thread t1=new Thread("first");
        Thread t2=new Thread("Second");
        System.out.println("Max priority of Thread Group: "+g1.getMaxPriority());
        System.out.println("First Priority: "+t1.getPriority());
        System.out.println("Second Priority: "+t2.getPriority());

        //Changing max priority of thread group to 3

        g1.setMaxPriority(3);
        System.out.println("\n*****************\n");
        Thread t3=new Thread("Third");
        System.out.println("Max priority of Thread Group: "+g1.getMaxPriority());
        System.out.println("First Priority: "+t1.getPriority());
        System.out.println("Second Priority: "+t2.getPriority());
        System.out.println("Third Priority: "+t3.getPriority());
    
    }
}