class xxxValue
{
  
    public static void main(String [] args)
    {
          //We can use xxxValue() methods to convert wrapper object to primitive.
        Integer i=new Integer(130);
        System.out.println(i.byteValue());//-126
        System.out.println(i.shortValue());//130
        System.out.println(i.intValue());//130
        System.out.println(i.longValue());//130
        System.out.println(i.floatValue());//130.0
        System.out.println(i.doubleValue());//130.0

        //Character class contains charValue() method to convert Character object to char primitive.
        Character ch=new Character('a');
        char c=ch.charValue();
        System.out.println(c);

        //Boolean class contains booleanValue() method to convert Boolean object to boolean primitive.
        Boolean b1=new Boolean("TRue");
        Boolean b2=new Boolean("hrishi");//non boolean
        System.out.println(b1.booleanValue());
        System.out.println(b2.booleanValue());
    }
}