public class InstanceVariable {
    
    boolean b;
    public static void main(String[] args) {
        InstanceVariable obj=new InstanceVariable();
        //instance variable initalized with default value by jvm
        //for accessing instane variable from static area we required Object reference
        //but from non static area we can access direclty
        System.out.println(obj.b);

    }
}