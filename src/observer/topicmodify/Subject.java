package observer.topicmodify;

import java.util.ArrayList;
import java.util.List;

public interface Subject { //주체이자 객체

//    List<Observer> observerList = new ArrayList<Observer>(); //인터페이스에서 필드 초기화 불가능! -> 구현체에서
    default List<Observer> getObserverList() {
        return new ArrayList<Observer>();
    }

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
    void postMessage(String msg);

}
