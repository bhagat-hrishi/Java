class innerclass 
{
    class insideinnerclass
    {
        public void m1()
        {
            System.out.println("I am method m1");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\nIn case of innner class without outer class Object there is no chance of existing inner class object");
        System.out.println("We \"cannot\" declare static memeber inside inner class");
        innerclass obj1=new innerclass();
        innerclass.insideinnerclass obj2=obj1.new insideinnerclass();//focus here on new statement
        obj2.m1();
        
    }
}