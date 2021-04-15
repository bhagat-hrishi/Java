/**
 * For every object jvm will generate a unique number which is nothing but
 * hashCode. 
 * If we didn't override hashCode() method then Object class
 * hashCode() method will be executed which generates hashCode based on address
 * of the object but it doesn't mean hashCode represents address of the object.
 */
class hash_code
{
    int i;
    hash_code(int i)
    {
        this.i=i;
    }
    public int hashCode()
    {
        System.out.println("My hashcode method");
        return i;
    }
    
    public static void main(String[] args) {
        System.out.println("here toString method called while printing Object which call current class hashCode method");
        hash_code obj=new hash_code(256);//as 256 in hex is 100 so o/p is
        System.out.println(obj);

    }
}