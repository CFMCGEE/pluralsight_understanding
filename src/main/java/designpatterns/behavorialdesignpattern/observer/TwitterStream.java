package designpatterns.behavorialdesignpattern.observer;

import java.util.Observable;

public class TwitterStream extends Observable {

    public void someoneTweeted() {

        setChanged();
        notifyObservers();

    }
}
