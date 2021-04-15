class Var_arg
{
    //This introduced in "1.5" version
    public static void m1(int ... x)
    {
        int sum=0;
        for(int i:x)
        {
            sum+=i;
        }
        System.out.println("Sum of elements: "+sum);
        System.out.println("I am var_arg");
    }
    
    /**
      In general var-arg method will get least priority that is if no other method
      matched then only var-arg method will get the chance this is exactly same as
      default case inside a switch.
     */
    //Original no arg is prefere with var-arg method
    public static void m1()
    {
        System.out.println("I am original no argument");
    }
    
    //we can mix general parameter with var-arg parameter but var-arg in this case should presnt at rightmost side
    //this is error  public static void general_and_var_arg(float ... f , String s)
    public static void general_and_var_arg(String s,float ... f)
    {
        System.out.println("general_and_var_arg");
    }
    //As internally var-arg method are implemented as 1D Array
    // public static void m1(int [] a)//this is error 
    // {

    // }
    

    //We cannot have more than one  variable argument   method 
    //Following is "Error"
    // static more_than_one_var_arg(int ... x,float ... f)//Error
    // {
    //     System.out.println("I am more than one var-arg methods");
    // }


    //As var-arg method is internlly uses 1d array then we can declare main method as below
    public static void main(String ... args)//use of var-arg 
    {
        m1(90);//with 1 arg
        System.out.println("_______________________\n");
        m1();//with no arg
        System.out.println("_______________________\n");
        m1(3,4,4,5,5,6,6);//with 7 arg
        System.out.println("_______________________\n");
  
        general_and_var_arg("Hrishi");
    }
}