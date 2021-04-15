//IMP Constrcutors of StringBuffer
class sb1
{
      public static void main(String [] args){
        //default intial capacity of StringBuffer is 16
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        //if we exceed capacity then
        //new capacity=(old capacity+1)*2;

        sb.append("abcdefghijklmnopqerr");
        System.out.println(sb.capacity());

        //-----------------------------------------------------------
        //create StringBuffer with intial capacity
        StringBuffer sb2=new StringBuffer(45);
        System.out.println(sb2.capacity());

        //-----------------------------------------------------------
        //Constructor to create StringBuffer from equivalent String
        StringBuffer sb3=new StringBuffer("hrishi");

        //if we create StringBuffer from String then capacity = (string length +16)
        System.out.println("Capacity is 6(for hrishi)+16: "+sb3.capacity());
    }

}