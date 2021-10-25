package structionaldesignpatterns.proxy.proxytestdemo;

public class TwitterServiceStub implements TwitterService {



    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }

}
