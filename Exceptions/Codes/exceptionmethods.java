class exceptionmethods
{
   
    public static void main(String[] args) {
        try{
            int a=190/0;
        }
        catch(Exception e)
        {
            System.out.println("default exeption handler internally uses printStackTrace() method to print exception on console");
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
}