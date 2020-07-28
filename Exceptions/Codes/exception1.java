import java.util.ArrayList;

class exception1 
{
    static void m1()
    {
        System.out.println("start m1");
        m2();
        System.out.println("end m1");
    }
    static void m2()
    {
        System.out.println("start m2");
        m3();
        System.out.println("end m2");
    }
    static void m3()
    {
        System.out.println("start m3");
        m4();
        System.out.println("end m3");
    }
    
    static  void m4()
    {
        System.out.println("start m4");
        System.out.println("Observe exception stack");
        int a=10/0;
        System.out.println("end m4");   
    }
    public static void main(String []  args)
    {

      List a=new ArrayList();
      a.add(2);
      System.out.println(a.get(0) instanceof Integer);

    }
}