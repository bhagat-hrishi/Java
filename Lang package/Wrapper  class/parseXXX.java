class parseXXX
{
    //We can use this method to convert String to corresponding primitive.
    public static void main(String [] args)
    {
        //form1 
        //Every wrapper class except Character class contains a static parseXxx() method to convert String to corresponding primitive.
        int i=Integer.parseInt("10");
        System.out.println(i);
        boolean b=Boolean.parseBoolean("ashok");//non boolean
        double d=Double.parseDouble("10.5");
        System.out.println(b);
        System.out.println(d);
        
        float f=Float.parseFloat("1.2f");
        System.out.println(f);

        /**
        integral type wrapper classes(Byte, Short, Integer, Long) contains the following
        parseXxx() method to convert specified radix String form to corresponding primitive.
         */
        int tmp=Integer.parseInt("100",8);
        System.out.println(tmp);//64
    }
}