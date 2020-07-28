class final_immutable
{
    /*
    1)final modifier applicable for variables where as immutability concept applicable for objects
    2)If reference variable declared as final then we can't perform reassignment for the reference variable 
    it doesn't mean we can't perform any change in that object.
    3)That is by declaring a reference variable as final we won't get any immutability nature .
    4)final and immutability both are different concepts .
     */
    public static void main(String [] args)
    {
        final StringBuffer sb=new StringBuffer("ashok");
        sb.append("software");
        System.out.println(sb);//ashoksoftware
        sb=new StringBuffer("solutions");//C.E: cannot assign a value to final variable sb
    }
}