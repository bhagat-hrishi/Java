//Overriding of static to non-static method is invalid
//following code show error
class parent 
{
    public static void m1()
    {
        System.out.println("I am static m1");
    }

}
class statictononstatic extends parent
{
    public void m1()
    {
        System.out.println("I am normal m1");
    }
    public static void main(String[] args) {
        
    }
    
}