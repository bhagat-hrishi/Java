public class constructor_and_instanceblock 
{
    static
    {
        System.out.println("\n-------------I am static and I will execute just once------------\n");
    }
    {
        System.out.println("I am intance block");
    }
    constructor_and_instanceblock()
    {
        System.out.println("hi from constructor");
    }
    public static void main(String[] args) 
    {
        System.out.println("both instance block and constructor are executed for every Object but instance block first then constructor");
        constructor_and_instanceblock obj1=new constructor_and_instanceblock();
        System.out.println("----------------");
        constructor_and_instanceblock obj2=new constructor_and_instanceblock();
    }
}