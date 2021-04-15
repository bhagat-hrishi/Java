//While Overriding we cant reduce scope of access modifier but we can take same scope or increase increase scope
class parent 
{
    public void m1()
    {
        System.out.println("I am parent m1");
    }
}
class reducescope extends parent
{
    protected void m1()//error
    {
        System.out.println("I am child m1");
    }
    public static void main(String[] args) {
        
    }
}