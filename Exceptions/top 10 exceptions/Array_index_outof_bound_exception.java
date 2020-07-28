/**
 * 1)This is child of runtime exception so it is unchecked
 *  2)Raised  automatically by the JVM whenever we are trying to access array element with
 * out of range index
 */
class Array_index_outof_bound_exception
{
    public static void main(String[] args) {
        int[] x = new int[10];
        System.out.println(x[0]);// valid
        System.out.println(x[100]);// AIOOBE
        System.out.println(x[-100]);// AIOOBE
    }
}