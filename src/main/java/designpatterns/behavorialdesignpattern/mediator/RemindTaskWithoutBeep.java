package designpatterns.behavorialdesignpattern.mediator;

import java.util.*;

public class RemindTaskWithoutBeep extends TimerTask {

    private Timer timer;

    public RemindTaskWithoutBeep() {
        timer = new Timer();
    }

    @Override
    public void run() {

        System.out.println("Now Time's really up!");
        timer.cancel();

    }

}
