class autoboxing_autunboxing2
{
    
    static Integer I=10;//autoboxing
    
    //As if we not provide value to Object 
    //As default for Object  is NULL so for J value is NULL
    static Integer J;//here we are not initialize
    public static void main(String [] args)
    {   
         //after compilation this step is  I.intValue() 
        int k=I;//auto unboxing
         
         //after compilation this step is  J.intValue() but J is NULL so we are calling method with NULL so we get NULLpointer exception 
         int m=J;
         System.out.println(m);//here we get error
        System.out.println(k);//10
    }
}