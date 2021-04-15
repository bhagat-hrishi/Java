//"non static method" cannot override as "static" in method in child class

class parent 
{
    public void m1()
    {
        System.out.println("I am normal method");
    }
}
class nonstatic_to_static  extends parent
{
    public static void m1()
    {
        System.out.println("I am static method");
    }
    public static void main(String[] args) {
        
    }
}
