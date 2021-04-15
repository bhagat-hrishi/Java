public class ThreadGroupConstructor {
    public static void main(String[] args) {
       
        //constructor 1
        //Here parent of new threadgroup is ThreadGroup of currently running Thread
        ThreadGroup parent=new ThreadGroup("Parent Group");
        System.out.println("parent's parent: "+parent.getParent().getName());
        

        //constructor 2
        //Here we specify that parent of new Thread Group is "parent"
         ThreadGroup child=new ThreadGroup(parent,"Second Group");
         System.out.println("child's parent: "+child.getParent().getName());
        //SystemGroup Acts as Root for all ThreadGroup’s in Java.
        System.out.println("Child's is also child of system: "+child.getParent().getName());
        System.out.println("Child's is also child of system: "+child.getParent().getParent().getName());
        //                                                      Parent Group   =>   main   => System 
         System.out.println("Child's is also child of system: "+child.getParent().getParent().getParent().getName());
    }
}