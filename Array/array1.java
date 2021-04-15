class array1
{
    public static void main(String [] args)
    {
        //1:At the time of array creation compulsory we should specify the size
        // int [] a=new int[];//C.E:array dimension missing

        //2:It is legal to have an array with size zero in java.
        int[] b=new int[0];
        System.out.println(b.length);//0

        //3:If we are taking array size with -ve int value then we will get runtime exception
        int[] c=new int[-3];//R.E:NegativeArraySizeException


        //4:Only allowed data type for array decleration are (byte,short,char,int) and other are NOT allowed
        int[] d=new int['a'];//(valid)
        byte bite=10;
        int[] a2=new int[bite];//(valid)
        /*long used*/int[] a3=new int[10l];//C.E:possible loss of precision//(invalid)
        /*double used*/int[] a4=new int[10.5];//C.E:possible loss of precision//(invalid)



        //declare 2  2D arrays
        int [][] tmp1,tmp2;
        tmp1=new int[2][3];
        tmp2=new int[3][4];

        //here tmp3 is 2D array but tmp4 is 1D array
        int []tmp3[],tmp4;
        tmp3=new int[2][3];
        tmp4=new int[3][4];//Error assigning 2D array to 1D array


        
    
    }
}