public class StaticVariable {
    static String s;
    public static void main(String[] args) {
        
        //initialize by default value
        //all variable share same copy of static variable
        System.out.println(s);
    }
}