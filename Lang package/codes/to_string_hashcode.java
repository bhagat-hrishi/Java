class to_string_hashcode
{
    int i;
    to_string_hashcode(int i)
    {
        this.i=i;
    }
    public int hashCode()
    {
        System.out.println("I am not Object class hashcode");
        return i;
    }
    public static void main(String[] args) {
        System.out.println("here Object class toString() method executed which indirectly call current class hashcode method");
        System.out.println("but if we doesn't override hashcode method then Object class hashcode method will be called");
        to_string_hashcode obj1=new to_string_hashcode(1);
       to_string_hashcode obj2=new to_string_hashcode(2);
       System.out.println(obj1);
       System.out.println(obj2);
    }

}