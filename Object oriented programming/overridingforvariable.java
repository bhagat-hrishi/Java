class parent 
{
    int x=190;
}
class overridingforvariable  extends parent
{
    int x=1234;
    public static void main(String[] args) {
        System.out.println("Overriding concept is \"NOT\" applicable for variable");
        System.out.println("Variable resolution is always takes care by compiler based on reference type.");
        parent p = new parent();
        System.out.println(p.x);
        overridingforvariable c = new overridingforvariable();
        System.out.println(c.x);
        parent p1 = new overridingforvariable();
        System.out.println(p1.x);
    }
}
