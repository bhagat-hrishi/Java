class singletone
{
    private  static singletone obj=null;
    private singletone()
    {
        System.out.println("I am constructor");
    }
    public static singletone getInstance()
    {
        if(obj==null)
        {
            obj=new singletone();
        }
        return obj;
    }
    void showMyId()
    {
        System.out.println("My Id: "+this);
    }
    public static void main(String[] args) {
        singletone obj1 = singletone.getInstance();
        singletone obj2 = singletone.getInstance();
        obj1.showMyId();
        obj2.showMyId();
    }
}