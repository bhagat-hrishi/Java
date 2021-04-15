class All_Active_Thread_From_System_Thread
{
    public static void main(String[] args) {
        //                                  main Thread  =>main ThreadGroup=>System
        ThreadGroup system_group_ref=Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[system_group_ref.activeCount()];
        system_group_ref.enumerate(t);
        
        System.out.println("Threads present inside System thredGroup: \n");
        for (Thread t1: t) {
            System.out.println(t1.getName()+"-------"+t1.isDaemon());
        }
    }
}