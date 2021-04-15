

class class_inside_another_inner_class
{
    class inner1 
    {
        class inner2
        {
            public void m1()
            {
                System.out.println("\n\nI am m1 method of class which is inside of another inner class\n");
            }
        }
    }
    public static void main(String[] args) {
        //check following declaration
        //creating Object of outer class
        class_inside_another_inner_class obj1=new class_inside_another_inner_class();
        //creating Object of 1st inner class
        inner1 obj2=obj1.new inner1();
        //creating Object of 2nd inner class
        inner1.inner2 obj3=obj2.new inner2();
        obj3.m1();
    }
}