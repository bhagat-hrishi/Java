class string1
{
    /*
    Because runtime operation if there is a change in content with those changes a new object will be created only on the heap but not in SCP.
    If there is no change in content no new object will be created the same object will be reused. "This rule is same whether object present on the Heap or SCP"
     */
    public static void main(String [] args)
    {
        //for below statement new Object created in heap area and SCP
        String s1=new String("hrishi");
        //as below statement create runtime Object and  changes content of String so new Object created inside heap only and not in SCP
        String s2=s1.toUpperCase();
        //as below statement create Object does not changes content of string so NO new Object created and existing Object is only reused 
        //so s3 and s1 pointing to same Object so s1==s3 return  true
        String s3=s1.toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        //here hashCode of Both s1 and s3 are same
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        //---------------------------------------------------------------------------------------------------------
        //here change in current Object content so new Object is created i.e HRISHI to hrishi 
        String s4=s2.toLowerCase();

        //As here also string Content changes from hrishi(s4) to HRISHI (s5) so new Object created
        String s5=s4.toUpperCase();

        //-----------------------------------
        //Inshort if content of current Obeject changes then only new Object is created
    
     }
}