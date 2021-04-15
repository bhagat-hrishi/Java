class IAmParent
{
    public static void main(String[] args) {
        System.out.println("Parent main method");
    }
}
//So This seems overriding concept applicable for main method but this is
//"method hiding " and not overriding
//compile and run by "java IamParent" and "java MainMethod2"
public class MainMethod2 extends IAmParent
{
    public static void main(String[] args) {
        System.out.println("Child main method");
    }

}