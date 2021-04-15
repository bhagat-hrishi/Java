/*here We are using covarient return type concept in  Overriding
upto 1.4 version return type must be same but from 1.5 version covarient return type are allowed
overriding(child method) method   return type would be child of return type of Overriden method (parent method)*/
class parent {
    public parent m1() {
        System.out.println("I am parent");
        return null;
    }
}
//so here parent class method return type is parent and child  class method is child which is subtype/child of parent class method return type
//if we change order of return type that is parent class return type is child of return type of child class method then we get error
class covarientreturn extends parent 
{
    public covarientreturn m1() {
        System.out.println("I am child");
        return null;
    }

    public static void main(String[] args) {
        parent obj = new parent();
        obj.m1();

        covarientreturn bj2 = new covarientreturn();
        bj2.m1();

        parent obj2 = new covarientreturn ();
        obj2.m1();
    }
}