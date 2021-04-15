
class parent
{   
    final void m1()
    {
        System.out.println("I am parent final method");
    }

    void m2()
    {
        System.out.println("I am parent m2");
    }

    
}
class final_method extends parent
{
    void m2()
    {
        System.out.println("I am child m2");   
    }
    //below method is error as we cannot override final method 
    //Also if we create final class then inheritance of that class is not possible
    void m1()
    {

    }
}