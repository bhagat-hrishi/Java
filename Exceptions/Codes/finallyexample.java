/*We require some place to maintain clean up code which should be executed
always irrespective of whether exception raised or not raised and whether
handled or not handled. Such type of best place is nothing but finally */
class finallyexample
{
    public static void main(String[] args)
     {
         System.out.println("If an exception raised but the corresponding catch block not matched then also finally will executed");
        try {
            int a=90/0;
            //catch block Exception is not matching to occured exception
            
        } catch (NullPointerException e) 
        {
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
            
        }
        finally
        {
            System.out.println("I am finally and I will  execute always");

        }

    }
}