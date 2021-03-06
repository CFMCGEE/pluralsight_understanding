package designpatterns.behavorialdesignpattern.visitor.visitortestdemo;

public interface AtvPartVisitor {

    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);

}
