class Parent {
    public void methodOne(int... i) {
        System.out.println("parent class");
    }
}

/**
 *  A var-arg method should be overridden with var-arg method only. If we are
 * trying to override with normal method then it will become "overloading" but not
 * overriding
 */
class pract extends Parent { // overloading but not overriding.
    public void methodOne(int i) {
        System.out.println("pract class");
    }

}
class overriding_var_arg_method
{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.methodOne(10);// parent class
        pract c = new pract();
        c.methodOne(10);// pract class
        Parent p1 = new pract();
        p1.methodOne(10);// parent class
    }
}