package designpatterns.behavorialdesignpattern.visitor;

public class Wheel implements AtvPart {

    @Override
    public double calculateShipping() {
        return 12;
    }

}
