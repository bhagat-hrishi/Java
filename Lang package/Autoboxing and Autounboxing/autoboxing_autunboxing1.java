/**
From 1.5 version onwards we can use primitives and wrapper objects interchangly the
required conversions will be performed automatically by compiler.
 */
class autoboxing_autunboxing1
{
    //All this is valid in 1.5 version  and INVALID in 1.4 version
    static Integer I=10;//autoboxing
    public static void main(String [] args)
    {
        int i=I;//autounboxing
        method(i);//while passing argument to method this is autoboxing
    }
    public static void method(Integer I)
    {
        int k=I;//auto unboxing
        System.out.println(k);//10

    }
}