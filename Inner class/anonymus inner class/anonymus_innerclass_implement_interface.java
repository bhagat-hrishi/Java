class anonymus_innerclass_implement_interface
{
    public static void main(String[] args) {
        
        Thread.currentThread().setName("Main");
        /**
         * Here we are not creating class that implemet Runnable interface we are
         * directly creating implementable Object of Runnable 
         */
        Runnable r=new Runnable()
        {
            public void run()
            {
                for(int i=0;i<5;i++)
                System.out.println(Thread.currentThread().getName());
            }
        };//this end with semicolon
        Thread t=new Thread(r, "Child");//creating Thread object and assigning name to thread 
        t.start();
        for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread().getName());

    }
}