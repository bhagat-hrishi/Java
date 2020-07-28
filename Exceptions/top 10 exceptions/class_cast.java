/**
 * This is child class of Runtime exception so it is unchecked Raised
 * automatically by the JVM whenever we are trying to type cast parent object to
 * child type
 */
class class_cast
{
    public static void main(String[] args) {
        Object o=new Object();
        class_cast obj=(class_cast)o;//typecasting of Object class Object to class_cast class which is wrong
    }
}