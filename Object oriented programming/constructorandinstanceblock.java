class constructorandinstanceblock 
{
    static int cnt=0;
    static{
        System.out.println("I will execute only onece\n---------");
    }
    {
        cnt++;
        System.out.println("I am intance block");
        System.out.println("Hi Object "+cnt);
    }
    constructorandinstanceblock()
    {
        System.out.println("hi from constructor\n---------");
    }
    public static void main(String[] args) {
        System.out.println("both instance block and constructor are executed for every Object but instance block first then constructor");
        constructorandinstanceblock obj1=new constructorandinstanceblock();
        constructorandinstanceblock obj2=new constructorandinstanceblock();
    }
}