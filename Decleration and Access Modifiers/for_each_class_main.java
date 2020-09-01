/**
1)We compile java program and not java class so for each class .class file is generated
2)We can run a java class but not java source file whenever we are trying to run a
class the corresponding class main method will be executed.
 */
 //try to run with "java for_each_class_main" and also "java tmp"
class for_each_class_main
{
    public static void main(String [] args)
    {
            System.out.println("for each class main");

    }
}

class tmp
{
    public static void main(String [] args)
    {
            System.out.println("for tmp class");

    }
}
