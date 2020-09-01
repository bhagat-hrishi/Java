public class StaticVariable {
    static String s;
    static boolean b;
    public static void main(String[] args) {
        
        //initialize by default value
        //all Object share same copy of static variable
        System.out.println("Default value for String  "+s);
        System.out.println("Default value for boolean: " + b );
    }
}