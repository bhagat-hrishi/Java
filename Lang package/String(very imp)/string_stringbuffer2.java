class string_stringbuffer2
{
    public static void main(String[] args) {

        /**
        In String class .equals() method is overridden for content comparison hence if the content is same .equals() method
        returns true even though objects are different.
         */
        String s1=new String("I am  from string ") ;
        String s2=new String("I am  from string ") ;

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        /*
        In StringBuffer class .equals() method is not overridden for content comparison hence Object class .equals() method got executed
        which is always meant for reference comparison. Hence if objects are different.equals() method returns false even though
        content is same.
         */
        StringBuffer s3=new StringBuffer("I am String Buffer");
        StringBuffer s4=new StringBuffer("I am String Buffer");

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        
    }
}