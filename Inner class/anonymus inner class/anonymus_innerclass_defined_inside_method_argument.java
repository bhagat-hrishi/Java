public class anonymus_innerclass_defined_inside_method_argument {
    public static void main(String[] args) {
        //Here we are defining inner class inside Thread method 
        new Thread(new Runnable(){
        
            @Override
            public void run() {
                for(int i=0;i<5;i++)
                    System.out.println("child");
            }
        }).start();
        for(int i=0;i<5;i++)
            System.out.println("main method");
    }

}