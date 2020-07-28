//while overriding we cannot decrease scope but we can increase scope 
//if we keep same scope this is also valid
class parent 
{
    protected void m1()
    {
        System.out.println("I am parent m1");
    }
    protected void m()
    {
        System.out.println("I am parent m2");
    }
}
class increasescope 
{
    public void m1()
    {
        System.out.println("I am child m1");
    }
    protected void m2()
    {
        System.out.println("I am child m2");
    }
    public static void main(String[] args) {
        
    }
}