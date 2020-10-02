class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void update(){
        System.out.println("Binary String :" + Integer.toBinaryString(subject.getState()));
    }
}