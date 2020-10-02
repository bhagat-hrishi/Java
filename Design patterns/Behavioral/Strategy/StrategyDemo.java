/*
    1)Define a family of algorithms, encapsulate each one, and make them interchangeable. 
    Strategy lets the algorithm vary independently from the clients that use it.
    2)Capture the abstraction in an interface, bury implementation details in derived classes.
 */

import java.util.*;
 
public class StrategyDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no1: ");
        int no1 = sc.nextInt();
        
        System.out.println("Enter no2: ");
        int no2 = sc.nextInt();
        
        Context context = new Context(new OperationAdd());
        System.out.println("ADD: "+ no1 + " "+ no2+" "+context.executeStrategy(no1,no2));

        context = new Context(new OperationSubstract());
        System.out.println("SUB: "+ no1 + " "+ no2+" "+context.executeStrategy(no1,no2));

        context = new Context(new OperationMultiply());
        System.out.println("MULTIPLY : "+ no1 + " "+ no2+" "+context.executeStrategy(no1,no2));
    }   
}