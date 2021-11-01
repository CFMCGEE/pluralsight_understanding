package designpatterns.behavorialdesignpattern.mediator;

import java.util.*;

public class RemindTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Time's up!");
    }

}
