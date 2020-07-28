/*
We can use throw keyword only for Throwable types otherwise we will get compile time
error saying incomputable types.
*/

class A
{

}
class B extends RuntimeException
{

}
class onlythrowabletypecanbethrown
{
    public static void main(String[] args)  {
        throw new B();//this is valid
        // throw new A();
        
    }
    
}