class widening_var_arg
{
    //Widening domiates var_arg method
    //if there is fight between old concept and new concept then old concept always get chance
    public static void methodOne(long l) {
        System.out.println("widening");
    }
    public static void methodOne(int... i) {
        System.out.println("var-arg method");
    }
    public static void main(String[] args) {
        int x=10;
        methodOne(x);
    }
}