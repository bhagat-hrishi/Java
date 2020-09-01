abstract class zero
{
    //This class does not contain any  abstract method
    //and still we can declare class as abstract
    void m1()
    {
        System.out.println("I am inside absrat class");
    }
}
class abstract_class_zero_abstract_method extends zero
{
    public static void main(String [] args)
    {
        abstract_class_zero_abstract_method obj=new abstract_class_zero_abstract_method();
        obj.m1();
        //we canot create Oject of abstract class
        zero obj2=new zero();//error

    }

}