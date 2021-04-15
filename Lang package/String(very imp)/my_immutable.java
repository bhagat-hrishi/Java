/*
Once we created an object we can't perform any changes in the existing object. If we are trying to perform any changes with those 
changes a new object will be created. If there is no change in the content then existing object will be reused. This behavior is
called immutability.
 */
final class my_immutable
{
    int i;
    my_immutable(int i)
    {
        this.i=i;
    }
    //As no one is allowed to change behaviour or override this method so we declare class as final
    public my_immutable modify(int i)
    {
        //if current calling Object content is same as incoming data then not create new object return same Object only
        if(this.i==i)
            return this;
        else//if change in content then retun new Object
            return (new my_immutable(i));
    }
    public static void main(String [] args)
    {
        my_immutable obj1=new my_immutable(1);
        
        my_immutable obj2=obj1.modify(2);

        my_immutable obj3=obj1.modify(1);

        System.out.println(obj1==obj2);
        System.out.println(obj3==obj1);
    }
}