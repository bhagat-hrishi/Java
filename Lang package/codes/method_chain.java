/**
For most of the methods in String, StringBuffer and StringBuilder the return
type is same type only. Hence after applying method on the result we can call
another method which forms method chain
 */
class method_chain
{
    //In method chaining all methods will be evaluated from left to right.
    public static void main(String [] args)
    {
        StringBuffer sb=new StringBuffer();
        sb.append("ashok").insert(5,"arunkumar").delete(11,13).reverse().append("solutions").insert(18,"abcdf").reverse();
         System.out.println(sb); // snofdcbaitulosashokarunkur
    }
}