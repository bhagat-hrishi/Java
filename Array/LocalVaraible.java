public class LocalVaraible {
    public static void main(String[] args) {
        int a;
        int b;
        //if you declare local variable and not using the this is fine and no error
        //Error in below statement
        System.out.println(b);//you declare local variable and you are using it

        //Only applicable modifier for local variable is final 
        //if you are using any other then you get error
        
        strictfp a=0;//error
    }
}