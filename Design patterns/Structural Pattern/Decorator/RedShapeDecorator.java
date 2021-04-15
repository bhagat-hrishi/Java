class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color : Red");
    }
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
}