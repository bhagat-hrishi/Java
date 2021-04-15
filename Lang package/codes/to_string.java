class to_string 
{
    // public String toString(){
    //     return "I am not Object class to String";
    // }
    public static void main(String[] args) {
        System.err.println("1)Whenever we are try to print any object reference internally toString() method will be executed.");
        System.out.println("2)If our class doesn't contain toString() method then Object class toString() \n method will be executed");

        to_string obj=new to_string();
        System.out.println("See o/p of both print is same");
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}