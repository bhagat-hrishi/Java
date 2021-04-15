class statement_after_throw
{
    /*
     * After throw statement we can't take any statement directly otherwise we will
     * get compile time error saying unreachable statement.
     */
    public static void main(String[] args) {

        throw new ArithmeticException("division by 0");
        System.out.println("this is unreachable code");//error
    }
}