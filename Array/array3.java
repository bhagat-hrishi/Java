import java.util.*;
class array3
{
    public static void main(String [] args)
    {
        //for primitive array as array element any type is allowed which can be promoted to declared type
        //For the int type arrays the allowed array element types are byte, short, char, int
        //For float type arrays the allowed element types are byte, short, char, int, long, float.
        float [] f=new float[2];
        f[0]='a';
        f[1]=90;
        System.out.println(f[0]+"    "+f[1]);


        //case of interface type arrays as array elements we can provide its implemented class objects.
        Runnable [] a=new Runnable[1];  
        Thread t=new Thread();
        a[0]=t;

    }
}