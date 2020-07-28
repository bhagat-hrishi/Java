public class CommandLine {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }

    }
}
//space act as delemiter in cmd line argument
//Run by "java CommandLine 1 2 3 4"
//I command line argument itself contain space then we should enclose in double quote 
//Run by java CommandLine 1 "hrishi bhagat"