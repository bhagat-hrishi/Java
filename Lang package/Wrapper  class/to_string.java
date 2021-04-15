class to_string
{
   
    public static void main(String [] args)
    {
         /*
    Each wrapper class contain toString method which is overriding version of Object class toString method
    Whenever we are trying to print wrapper object reference internally this toString() method only executed.
     */
        Integer i=Integer.valueOf("10");
        System.out.println(i);//10
        System.out.println(i.toString());//10

         //Every wrapper class contains a static toString() method to convert primitive to String.

        String s1=Integer.toString(10);
        String s2=Boolean.toString(true);
        String s3=Character.toString('a');
        System.out.println(s1); //10
        System.out.println(s2); //true
        System.out.println(s3); //a

        //--------------------Some more methods---------------

        String s11=Integer.toBinaryString(7);
        String s22=Integer.toOctalString(10);
        String s33=Integer.toHexString(20);
        String s4=Integer.toHexString(10);
        System.out.println(s11);//111
        System.out.println(s22);//12
        System.out.println(s33);//14
        System.out.println(s4);//a
    }
}