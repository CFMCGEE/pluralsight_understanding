package behavorialdesignpattern.observer.observertestdemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream  extends Subject {

    //Deque: A linear collection that supports element insertion and removal at both ends. (Deque being short for "double ended queue")

    private Deque<String> messageHistory = new ArrayDeque();

    @Override
    void setState(String message) {

        messageHistory.add(message);

        this.notifyObservers();

    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
