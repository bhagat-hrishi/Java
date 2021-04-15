class array2
{
    public static void main(String[] args)
    {
        //at time of creation each element is intitialized with default value
        int [] a=new int[4];
        boolean []b=new boolean[2];
        for(int tmp:a)
            System.out.println(tmp);
        System.out.println("-------------------------------------------------------");
        for(boolean tmp:b)
            System.out.println(tmp);
        System.out.println("-------------------------------------------------------");
        //Whenever we are trying to print any object reference internally toString() method
        float [][] f=new float[3][2];
        System.out.println(a);
        System.out.println(f);
        System.out.println(f[0]);
        System.out.println(f[0][0]);
        System.out.println("-------------------------------------------------------");

        //length is final variable applicable for array which give size of array and length() method is used for String
        int [] x=new int[3];
        System.out.println("length: "+x.length);//3

        //In multidimensional arrays length variable represents only base size but not total size. <----------------------------------------------
        int[][] tmp=new int[6][3];
    System.out.println(tmp.length);//6

    
    }

}