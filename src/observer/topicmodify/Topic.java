package observer.topicmodify;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private String msg;
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public List<Observer> getObserverList() {
        return observerList;
    }

    @Override
    public void register(Observer obj) {
        if(!observerList.contains(obj))
             observerList.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        System.out.println("observer들에게 알림 전달 ");
        observerList.forEach(observer -> {
            observer.update(msg);
        });
    }

    @Override
    public void postMessage(String msg) {
        this.msg = msg;
        System.out.println("게시글 포스팅 : " + msg);
        notifyObservers();
    }
}
