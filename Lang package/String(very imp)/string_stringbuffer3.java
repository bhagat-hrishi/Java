class string_stringbuffer3
{
    
    public static void main(String[] args) 
    {
        //All string constructors 

        //Here String Object present which has 0 length
        String s1="";
        //Here String Object is not present (Object itself is not present)
        String s2=null;
        
        //Create empty String Object with 0 size
        String s3=new String();

        //Creating String object from give  String literal
        String s3=new String(String literal);

        //for give  String buffer create equivalent String Object
        String s3=new String(StringBuffer sb);

        //Creating String Object from give char array
        String s3=new String(char [] ch);
        ex-> char ch[]={'a','b','c','d'};
        String s=new String(ch);

        //from given byte array create equivalent String Object
        String s3=new String(byte [ ] b);
        ex->byte b[]={100,101,102,103};

        String s=new String(b);
        sopln(s);//ans is defg <-------------------------------------------- ans is imp (unicode value converted to character)



    }
}