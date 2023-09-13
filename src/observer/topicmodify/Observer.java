package observer.topicmodify;

import java.util.ArrayList;

public interface Observer {

     ArrayList<Observer> observerList = new ArrayList<Observer>();
    void update(String msg);


}
