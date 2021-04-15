class Outer 
{
    class Inner 
    {
        public void m1()
        {
            System.out.println("I am inside of inner class");
        }

    }

}
public class accessing_inner_class_code_from_outside_of_outer_class
{
    public static void main(String[] args) {

        new Outer().new Inner().m1();//object creation
//   Outer Object=>Inner Object=>method
    }

}