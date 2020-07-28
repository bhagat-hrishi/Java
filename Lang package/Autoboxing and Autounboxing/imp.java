class imp
{
    /* While resolving overloaded methods compiler will always gives the presidence in the following order :
    1. Widening
    2. Autoboxing
    3. Var-arg method
     */

    public static void methodOne(long l) {
        System.out.println("widening");
    }
    public static void methodOne(Integer i) {
        System.out.println("Autoboxing");
    }
    public static void methodOne(int... i) {
        System.out.println("var-arg method");
    }

    public static void autoboxing_widening(Object o){
        System.out.println("object");
    }
    public static void main(String[] args) {
        int x=10;
        methodOne(x);//Widening

        //widening to autoboxing is NOT Allowed means int ---> long ---->Long [wrapper class] (not allowed)
       
        Long i=10;//this is error
        long k=10;//work fine

         //but autoboxing to widening is allowed means like int -----> Integer ----> Object
        autoboxing_widening(x);//work fine
        Object o=10;//this is valid
        Number n=10;
    }
}