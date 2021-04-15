class bool
{
    public static void main(String [] args)
    {
        /*
        If we want to pass boolean primitive the only allowed values are true, false where case should be lower case.
         */
         Boolean b1=new Boolean(true);
         Boolean b2=new Boolean(false);
         //Boolean b3=new Boolean(TRUE);// this is C.R.

         /**
         If we are passing String argument then case is not important and content is not important. 
         If the content is case "insensitive" String of "true" then it is treated as true in all other cases it is treated as false.
          */
        Boolean b4=new Boolean("true");//true
        Boolean b5=new Boolean("false");//false
        Boolean b6=new Boolean("TRUE");//true
        Boolean b7=new Boolean("TRuE");//true
        
        Boolean b8=new Boolean("FALSE");//false
        Boolean b9=new Boolean("Hrishi");//false

        System.out.println("b1 : "+b1+"\n-----\n");
        System.out.println("b2 : "+b2+"\n-----\n");
        System.out.println("b4 : "+b4+"\n-----\n");
        System.out.println("b5 : "+b5+"\n-----\n");
        System.out.println("b6 : "+b6+"\n-----\n");
        System.out.println("b7 : "+b7+"\n-----\n");
        System.out.println("b8 : "+b8+"\n-----\n");
        System.out.println("b9 : "+b9+"\n-----\n");
    }
}