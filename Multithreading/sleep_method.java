class sleep_method
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread.currentThread().sleep(2000);
        System.out.println("B");
        Thread.currentThread().sleep(2000);
        System.out.println("C");
        Thread.currentThread().sleep(2000);
    }
}