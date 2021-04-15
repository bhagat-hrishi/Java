/**
 
Facade pattern hides the complexities of the system and provides an interface to the client 
using which the client can access the system. This type of design pattern comes under structural 
pattern as this pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by client 
and delegates calls to methods of existing system classes.
 
Facade Patten provide unified interface to set of interfaces in Subsystem
Facade provide Higher level Interface which make system easy to use
*/

public class FacadeDemo{
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}