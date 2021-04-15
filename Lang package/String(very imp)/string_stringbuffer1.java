class string_stringbuffer1
{
    public static void main(String[] args) {
        /*
        Once we create a String object "we can't perform " any
        changes in the existing object. If we are try to
        perform any changes with those changes a new
        object will be created This behavior is called
        immutability of the String object.
        "Strig Objects are immutable"
         */
        String s1=new String("Hrishikesh");
        String s2=s1.concat("Bhagat");
        System.out.println(s1);
        System.out.println(s2);
        if(s1==s2)
            System.out.println("Both String Objects are \" equal\" ");
        else
           System.out.println("Both String Objects are  \"not equal\" ");
        /**
        Once we created a StringBuffer
        object "we can perform" any
        changes in the existing object.
        This behavior is called mutability
        of the StringBuffer object.
         */
        StringBuffer s3=new StringBuffer("Hrishikesh");
        StringBuffer s4=s3.append("Bhagat");
        System.out.println(s3);
        System.out.println(s4);
        if(s4==s3)
            System.out.println("Both StringBuffer Objects are \"equal\"");
        else
           System.out.println("Both StringBuffer Objects are \"  not equal\" ");


    }
}