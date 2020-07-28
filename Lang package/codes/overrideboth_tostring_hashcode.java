class overrideboth_tostring_hashcode
{
    int i;
    overrideboth_tostring_hashcode(int i)
    {
        this.i=i;
    }
    public String toString()
    {
        System.out.println("I am toString");
        return "no: "+i;   
    }
    public int hashCode()
    {
        System.out.println("I am hashCode");
        return i;
    }
    public static void main(String[] args) {
        System.out.println("here Only toString method called");
        overrideboth_tostring_hashcode obj1=new  overrideboth_tostring_hashcode(1);
        overrideboth_tostring_hashcode obj2=new overrideboth_tostring_hashcode(2);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}