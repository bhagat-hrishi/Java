class finallysystemexit
{
    public static void main(String[] args) {
        System.out.println("When ever we are using System.exit(0) then JVM itself will be shutdown , in this case finally block won't be executed.");
        try
        {
            //here finally block won't be executed
            System.out.println("try");
            int a=10/0;//this line cause exception if we comment this line then finally block don't executed
            System.exit(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("catch block executed");
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}