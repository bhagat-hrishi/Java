/*
    1)Object at central is called Component and one wrapping component is call Decorator
    and one wrapping decorator is called Decorator
    2)Attach additional responsibilities to an object dynamically.
*/

abstract class ok 
{
     abstract void m1();
     void m2()
     {
         System.out.println("This is data from m2");
     }
}
class DecoratorDemo extends ok {
    void m1()
    {
        System.out.println("This is frmo m1");
    }
    public static void main(String[] args) {
        DecoratorDemo obj =  new DecoratorDemo();
        obj.m2();
    }
}