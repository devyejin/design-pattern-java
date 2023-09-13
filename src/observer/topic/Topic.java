package observer.topic;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String  message;


    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override //Observer  가입
    public void register(Observer obj) {
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);

    }

    @Override
    public void notifyObservers() {
        //        this.observers.forEach(Object::notify);
        this.observers.forEach(observer -> {
            observer.update();
        });
    }

    @Override
    public Object getUpdate(Observer obj) {

        return this.message;

    }

    @Override
    public void postMessage(String msg) {
        System.out.println("subscriber 에게 메시지를 전달 : " + msg);
        this.message = msg;
        notifyObservers(); //관찰자들에게 메시지 전달
    }


}
