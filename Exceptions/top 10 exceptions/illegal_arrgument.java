/*
1)It is the child class of RuntimeException and hence it is unchecked. 
2)Raised explicitly by the programmer (or) by the API developer to indicate that a method
has been invoked with inappropriate argument.
*/
class illegal_arrgument
{
    public static void main(String[] args) {
        Thread t=new Thread();
        t.setPriority(700);//priority value in between 1  to 10
    }
}