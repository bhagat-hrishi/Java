class var_arg_autoboxing
{
    /*
    var arg method has least priority if no other case matched then only var_arg method get chance
    Autoboxing dominates var-arg method.
     */
    public static void methodOne(Integer i) {
        System.out.println("Autoboxing");
    }
    public static void methodOne(int... i) {
        System.out.println("var-arg method");
    }
    public static void main(String[] args) {
        int x=10;
        methodOne(x);//Autoboxing
    }

}