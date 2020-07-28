import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        System.out.println("Top: "+s.peek());
        //search give offset that is position of element from top of stack

        System.out.println("Offset of 1 :"+s.search(1));
    }
}