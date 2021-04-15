class anonymus
{

    public static int sum(int[] x)
    {
        int total=0;
        for(int x1:x)
        {
        total=total+x1;
        }
        return total;
    }
    public static void main(String [] args)
    {
        //decalaration  
        new int[]{10,20,30,40};//valid
        new int[][]{{10,20},{30,40}};//valid

        
        //At the time of anonymous array creation we can't specify the size otherwise we will get compile time error.
        new int[3]{10,20,30,40};//C.E:';' expected(invalid)

        //use of anonymus array
        System.out.println(sum(new int[]{10,20,30,40}));//100
    }
}