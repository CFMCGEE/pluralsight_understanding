package behavorialdesignpattern.observer;

public class Observer {

            /*

                          Observer Class (Behavioral Design Pattern)
                          - One to many observers
                          - Decoupled (communication)
                          - Event Handling
                          - Pub/Sub
                          - M-V-C
                          - Broadcast Communication
                          - Built in functionality
                          - Used with mediator
                          - Examples:
                           - java.util.observer
                           - java.util.EventListener
                           - javax.jms.Topic

                           Design
                           - Subject that needs to be observed (typically an interface or abstract class)
                           - Observer (is an interface based concrete class that has implementation)
                           - Observable
                           - Concrete observer are viewed as Observers
                           - Subject, Concrete Subject, Observer, Concrete Observer

            */

    public static void main(String[] args) {

        TwitterStream messageStream = new TwitterStream();

//        Client client1 = new Client("Bryan");
//
//        Client client2 = new Client("Mark");
//
//        messageStream.addObserver(client1);
//        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }


}
