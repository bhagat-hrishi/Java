class singletone
{
    private  static singletone obj=null;
    private singletone()
    {
        System.out.println("I am constructor");
    }
    singletone getInstance()
    {
        if(obj==null)
        {
            obj=new singletone();
        }
        return obj;
    }
    public static void main(String[] args) {
        
    }
}