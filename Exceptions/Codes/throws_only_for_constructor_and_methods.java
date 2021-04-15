/**
 * We can use throws keyword only for constructors and methods but not for
 * classes
 */
class throws_only_for_constructor_and_methods throws Exception // this is invalid
{
    throws_only_for_constructor_and_methods() throws Exception //this is valid
    {
        System.out.println("I am constructor");
    }
    public static void main(String[] args) throws Exception //this is also valid 
    {

    }
}