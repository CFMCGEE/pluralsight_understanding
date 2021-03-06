package designpatterns.structionaldesignpatterns.bridge.bridgetestdemo2;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }

}
