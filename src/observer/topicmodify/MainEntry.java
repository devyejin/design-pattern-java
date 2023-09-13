package observer.topicmodify;


public class MainEntry {

    public static void main(String[] args) {
        Subject topic = new Topic();

        Observer a = new TopicSubscriber("A");
        Observer b = new TopicSubscriber("B");
        Observer c = new TopicSubscriber("C");

        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("이번주면 디자인패턴 챕터가 끝난다는데 다들 알고 계신가요?!");

    }
}
