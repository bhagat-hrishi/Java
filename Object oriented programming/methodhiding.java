//here both parent and child class methods are static so these is "method hiding" not overriding
class parent 
{
    static void m1()
    {
        System.out.println("I am parent static method");
    }

}
class methodhiding  extends parent 
{
    static void m1()
    {
        System.out.println("I am child static method");
    }
    public static void main(String[] args) {
        System.err.println("Method hinding is compile time polymorphism\n");
        System.out.println("parent object parent value");
        parent obj1=new parent();
        obj1.m1();
        System.out.println("\nparent Object child value");
        parent obj2=new methodhiding();
        obj2.m1();
        System.out.println("\nchild object child value");
        methodhiding obj3=new methodhiding();
        obj3.m1();
    }
}
