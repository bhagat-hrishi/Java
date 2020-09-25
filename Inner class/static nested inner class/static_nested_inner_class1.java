public class static_nested_inner_class1 {
    int a=90;
    static int b=232;
   /**
    * Inside static nested classes we can declare static members including main()
    * method also. Hence it is possible to invoke static nested class directly from
    * the command prompt.
    */
    //to call directly  static inner class use java outer_class_name$inner_class_name
    static class inner
    {
        public void show()
        {
            // Inside static nested inner class we can access static member of outer class
            // only
            System.out.println("Instance membe of Outer class : " +a);// error
            System.out.println("Static member of Outer class : " +b);

        }
        public static void main(String[] args) {
            System.out.println("main of inner");
            
        }
    }
    public static void main(String[] args) {
        System.out.println("main of outer");
    }
}