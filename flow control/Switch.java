public class Switch {
    public static void main(String[] args) {
        

        //Except switch else were {} are optional

        //switch(5)//error

        //cases and default is optional
        // switch(90)//valid
        // {
        //         /**
        //          * Every statement inside switch must be under some case (or) default.
        //          * Independent statements are not allowed
        //          */
        //         System.out.println("I am independent statement");//error
        // }

        int x=90;
        final int y=2;
        switch (90) {
            //Every case lable should be compile time constant else we get Error
            case x://error
                System.out.println("cdcd");
                break;
            
            case y://This is valid as y is final variable
                ;
            default:
                System.out.println(" I addcd");
                break;
        }


        //Every Case label should be in range of Switch argument type
        //here we are using byte so case label should in range of byte (-256 to 255)
        byte b = 10;
        switch (b) 
        {
            case 10:
                System.out.println("10");
            case 100:
                System.out.println("100");
            case 1000://error
                System.out.println("1000");
        }
        

        //Within switch statement we can default only once
        switch(89)
        {
            case 89:
                break;
            default:
                ;
            default://error
                ;
        }

    }
}