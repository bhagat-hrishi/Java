public class ThreadGroup1 {
    public static void main(String[] args) {
        /**Every Thread in java belong to some  thread group */
        //main Thread belong to "main Thread group"
        System.out.println("main thread belog to group: "+Thread.currentThread().getThreadGroup().getName());

        //Every thread group is child group of "system" either directly or indirectly
        //SystemGroup Acts as Root for all ThreadGroup’s in Java.
        System.out.println("parent group of \"main Thread group\": "+ Thread.currentThread().getThreadGroup().getParent().getName());

        /** 
         * System group contain several system level threads like
         *   finalized
         * referecend handler 
         * signal dispatcher 
         * attached listener 
        */
    }
}