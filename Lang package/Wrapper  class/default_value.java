class default_value
{
    Byte b;
    Short s;
    Integer i;
    Long l;
    Float f;
    Double d;
    Character ch;
    Boolean bn;

    public static void main(String [] args) throws Exception
    {
        default_value obj=new default_value();
       System.out.println(obj.b);
       System.out.println(obj.s);
       System.out.println(obj.i);
       System.out.println(obj.l);
       System.out.println(obj.f);
       System.out.println(obj.d);
       System.out.println(obj.ch);
       System.out.println(obj.bn);
       
    }
}