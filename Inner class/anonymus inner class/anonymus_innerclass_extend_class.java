
//Anonymus inner class that extends class
class parent
{
    public void m1()
    {
        System.out.println("I am parent M1 method");
    }
}
public class anonymus_innerclass_extend_class {
    public static void main(String[] args) {
        parent obj=new parent()
        {
            public void m1()
            {
                System.out.println("I am child ");
            }
        };//this is child class just for instance use only
        obj.m1();

        parent obj2=new parent();
        obj2.m1();
    }

}