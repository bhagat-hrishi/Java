/*
    1)Object at central is called Component and one wrapping component is call Decorator
    and one wrapping decorator is called Decorator
    2)Attach additional responsibilities to an object dynamically.
    Decorators provide a flexible alternative to subclassing for extending functionality
*/

class DecoratorDemo{
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("\nCircle with normal boredr");
        circle.draw();

        circle = new RedShapeDecorator(circle);
        System.out.println("\nCircle with Red boredr");
        circle.draw();
        
    }
}