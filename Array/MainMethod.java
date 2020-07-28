class Parent
{
    // cheking of main method done by JVM and not by compiler
    // we can change "order of modifier" for main method observe below

    strictfp static final public synchronized void main(String... hrishi)// instead of args we can use any valid  identifier
    {
        // we can add  "final,synchronize,strictfp"   modifier to main method
        System.out.println("\n\nI am string main\n\n");
    }

    // Overloading of main possible but JVM call String argument main method
    public static void main(int[] args) {
        System.out.println("I am int main method");
    }
}

public class MainMethod extends Parent
{
    //Inheritance concept applicable for main method
    //if child class does not contain main method then parent class main method executed
    //this is child class which not contain main method in such cases parent class main method is executed
}