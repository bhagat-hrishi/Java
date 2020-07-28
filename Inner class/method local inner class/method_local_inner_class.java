class method_local_inner_class
{
    static int x=90;
    int y=9;
    public static void staticmethod()
    {
        class method_local1
        {
            void m1()
            {
                System.out.println("\nI am static method");
                System.out.println("\nInner class inside static method can acess only static membe of outer class");
                //System.out.println("non static member: "+y);//this is error
                System.out.println("static member: "+x);
            }
        }
        method_local1 obj1=new method_local1();
        obj1.m1();
    }
    public void nonstaticmethod()
    {
        class method_local2
        {
            public  void m1() 
            {
                System.out.println("************************\nI am instance method");
                System.out.println("inner class inside instance method can access static and also non static member of outer class");
                System.out.println("non static member of outer class: "+y);
                System.out.println("static member of outer class: "+x);

                
            }
        }
        method_local2 obj1=new method_local2();
        obj1.m1();

    }
    public static void main(String[] args)
    {
        method_local_inner_class obj=new method_local_inner_class();
        obj.staticmethod();
        obj.nonstaticmethod();
        
    }
}