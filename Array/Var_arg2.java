public class Var_arg2 {
    
    //we can call this method by passing group of elements
    static void m1(int ... x)
    {
            System.out.println("I am m1");
    }
    //we can call this method by passing group of "1D" Arrays
    static void m2(int[] ...x)
    {
            System.out.println("I am m2");
    }
    
    public static void main(String[] args) {
        
        m1(2,3,4,5,6);

        int []arr1={1,2,4,5,6,7};
        int []arr2={3,4,5,6,7,8,2};
        m2(arr1,arr2);//passing arrays to function
    }
}