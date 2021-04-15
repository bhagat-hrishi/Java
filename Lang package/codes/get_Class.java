import java.lang.reflect.*;
//Method class present in java.lang.reflect.*;
class get_Class
{
    /**
    getClass method present in Object class return runtime Class defintion of Object and from that 
    returened  "Class" type Object we can acess class level properties such as name of class,how many methods 
    that class has etc.
    inshort from Object of class we can take all information of that class by this getClass method
     */
    public static void main(String[] args) {
        int count_methods=0;
        String s=new String("Hrishikesh");
        Class c=s.getClass();
        System.out.println("Fully qualified Class name: "+c.getName());

        Method [] m=c.getDeclaredMethods();
        System.out.println("Methods Information");

        for(Method m1:m)
        {
            count_methods++;
            System.out.println(m1.getName());
        }

        System.out.println("No of methods are :"+count_methods);
            
    }
}