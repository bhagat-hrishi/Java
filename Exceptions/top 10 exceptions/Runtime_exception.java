/**
 * 1)It is child of runtime exception so it is unchecked exception
 *  2)Raised automatically by the JVM, whenever we are trying to call any method on null
 */
class Runtime_exception
{
    public static void main(String []  args)
    {
            String s = null;
        System.out.println(s.length()); // R.E: NullPointerException
    }
}