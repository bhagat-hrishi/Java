class equal {
    public static void main(String[] args) {
    /**
    If there is no relationship between argument types then .equals() method
    simply returns false and we won't get
    any compile time error and runtime
    error.
     */
    String s = new String("ashok");
    StringBuffer sb = new StringBuffer("ashok");
    System.out.println(s == sb); // CE : incomparable types : String and StringBuffer
    System.out.println(s.equals(sb)); //false here there is no relation between String and StringBuffer then also it return false
    }
}
