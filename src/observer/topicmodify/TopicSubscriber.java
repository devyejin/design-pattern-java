package observer.topicmodify;

public class TopicSubscriber implements Observer {

    private String name;
    private String msg;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "포스팅 받음 >> " + msg);
    }


}
