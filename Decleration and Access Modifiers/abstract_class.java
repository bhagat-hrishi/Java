
abstract class grandparent
{
    abstract void m1();
    abstract void m2();
}

//in parent class we have define only one method m1 of grandparent class  so we have to declare this class as abstract
//and child of parent must provide definition for other remainig methods
abstract class parent extends grandparent
{
    void m1()
    {
        System.out.println("I am m1");

    }
}
//for remainnign method of grandparent class which is m2 in this class we have to define this method
class abstract_class  extends parent
{
    void m2()
    {
        System.out.println("I am m2");

    }
    public static void main(String [] args)
    {
        abstract_class obj=new abstract_class();
        obj.m1();
        obj.m2();

        //we cannot create Object of abstract class as implementataion is not complete so we cannot create
        parent obj2=new parent();//error

    }
    
}