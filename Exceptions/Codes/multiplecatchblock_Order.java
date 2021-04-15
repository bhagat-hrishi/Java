/*If try with multiple catch blocks present then order of catch blocks is very
important. It should be from child to parent by mistake if we are taking from
parent to child then we will get Compile time error saying exception xxx has already been caught"*/
class multiplecatchblock
{
    //here as Arithmetic Exception is child of Exception so A.E. should come first then Exception
     public static void main(String[] args) {
        try{
            int a=90/0;
        }
        catch(Exception e)
        {

        }
        catch (ArithmeticException e)
        {

        }
    }
}