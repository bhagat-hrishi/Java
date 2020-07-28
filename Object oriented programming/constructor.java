class constructor 
{
    constructor()
    {
         this(12);
        // super();
        System.out.println("I am");
    }
    constructor(int a)
    {
        System.out.println("I am here");
    }

    void constructor()//metod name same as constructor name
    {
        System.out.println("I am noraml method not constructor");
    }
    public static void main(String[] args) 
    {
        // System.out.println("It is legal to have method with same name as constructor but it is not good programming");
        // System.out.println("moifier applicale for constructor are private,default,protected,public if we are using any other we get error");
        constructor obj=new constructor();
        obj.constructor();
        
    }
}