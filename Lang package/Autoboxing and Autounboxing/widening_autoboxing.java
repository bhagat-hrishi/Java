class widening_autoboxing
{
    //methodOne is overloaded here 
    /**
    Widening is assignment of smaller data type variable to bigger data type variable
    Widening domiates autoboxing 
    As widening is old concept and autoboxing is new concept so
     */
    public static void methodOne(long l) {
        System.out.println("widening");
    }
    public static void methodOne(Integer i) {
        System.out.println("autoboxing");
    }
    public static void main(String[] args) {
        int x=10;
        methodOne(x);
    }
}