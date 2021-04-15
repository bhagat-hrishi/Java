/**
 * In our program with in the try block, if there is no chance of rising an
 * exception then we can't right catch block for that exception otherwise we
 * will get compile time error sayingexception XXX is never thrown in body of
 * corresponding try statement. But this rule is applicable only for "fully
 * checked exception"
 */
/**
 * here InterruptedException and java.io.Exception are fully checked exception so we get error
 * if we use any another partially checked exception or unchcked exception then we don't get any compile time error 
 */
class fully_checked_exception_IMP_property
{
    public static void main(String[] args) {
        try{
                System.out.println("hello");
        }
        catch(java.io.IOException e)
        {

        }
    }
}