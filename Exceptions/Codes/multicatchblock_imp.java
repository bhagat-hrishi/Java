/**
 * In multi catch block, there should not be any relation between Exception
 * types(either child to parent Or parent to child Or same type , otherwise we
 * will get Compile time error )
 */
class multicatchblock_imp
{
    public static void main(String[] args) {
        try{

        }
        catch(Exception  /*This is parent*/|ArithmeticException e/*This is child of Exception */ )
        {
            e.printStackTrace();
        }
    }
}