abstract class parent 
{
    parent(int a)
    {
        System.out.println("hello I am parent");
    }
   //for this program we get error as we are not included parent class constructor

}
//when parent class contain any argument constructor then child class should take care with respect to construtcor
//whenever we are writing argument constructror then in HIGHLY recommended to write non argument constructor
class parent_child_constructor extends parent
{
  
    
    parent_child_constructor()
    {
        // super(90);
        System.out.println("hello I am child");
    }
    public static void main(String[] args) 
    {
      
        System.out.println("When we create child class Object parent class constructor is automatically called");
        parent_child_constructor obj=new parent_child_constructor();
    }
}