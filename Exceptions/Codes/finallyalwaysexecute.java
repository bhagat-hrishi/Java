class finallyalwaysexecute
{
    public static void main(String[] args) {
        int a = 90;
        try {
                a=90/0;
        } catch (Exception e) {
            System.out.println("\n_____Inside catch______\n");
            //Exception occur inside catch then also finally executed
             a=90/0;
        } finally {
            System.out.println("\n___I am finally____\n");
        }
    }
}