package designpatterns.behavorialdesignpattern.visitor.visitortestdemo;

public class Fender implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }

}
