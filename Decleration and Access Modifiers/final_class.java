/**
1)We cannot create Object of final class
2)Every method present inside a final class is always final by default whether we are
declaring or not. But every variable present inside a final class need not be final.
 */
class final_class
{
    static int a=0;
    static
    {
        a=90;//here we change value of a
    }
    void m1()
    {

    }
    public static void main(String [] args)
    {
        
    }    
}