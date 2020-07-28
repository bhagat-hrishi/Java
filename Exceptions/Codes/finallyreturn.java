class finallyreturn
{
    public static void main(String[] args)
{       
    System.out.println("Even though return statement present in try or catch blocks first finally will be executed and after that only return statement will be considered.");
    try
    {
        System.out.println("try block executed");
        return;//this is return statement
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