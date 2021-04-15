class accessing_members_of_outer_inside_inner
{
    static int a=90;
    int b=8;
    private int x=89;
    public int y=89;
    private void m1()
    {
        System.out.println("I  am private method of outer class");
    }
    
    class anotherinner 
    {
        int b=9;//inner class b
        void method()
        {
            int b=23;
            System.out.println("method declared b "+b);
            // inner class b
            System.out.println("inside inner class this refer to current class object so "+this.b);
            //following give outer class b
            System.out.println("to access outer class object we should use outercalss.this  so "+ accessing_members_of_outer_inside_inner.this.b);
            System.out.println("Outer Static: "+ a);
            System.out.println("Outer Instance: "+b);
            System.out.println("Outer private : "+x);
            System.out.println("Outer Public : "+y);
            m1();

        }
    }
    public static void main(String[] args) {
        System.out.println("\n\nform inner class we can access all type of memebers of outer class");
        System.out.println("Including private,public,static and non-static");

        new accessing_members_of_outer_inside_inner().new anotherinner().method();
    }
}