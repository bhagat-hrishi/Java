class finallyalwaysexecute
{
    public static void main(String[] args) {
        int a = 90;
        try {
                a=90/0;
        } catch (Exception e) {
            System.out.println("Inside catch");
             a=90/0;
        } finally {
            System.out.println("I am finally ");
        }
    }
}