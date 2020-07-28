public class ThreadGroupConstructor {
    public static void main(String[] args) {
        //constructor 1
        ThreadGroup parent=new ThreadGroup("Parent Group");
        System.out.println("parent's parent: "+parent.getParent().getName());
        //g1 is parent threadgroup for g2  threadgroup
        //constructor 2
         ThreadGroup child=new ThreadGroup(parent,"Second Group");
         System.out.println("child's parent: "+child.getParent().getName());
    }
}