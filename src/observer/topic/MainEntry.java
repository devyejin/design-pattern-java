package observer.topic;

public class MainEntry {

    public static void main(String[] args) {

        Topic topic = new Topic();

        Observer A = new TopicSubscriber("A", topic);
        Observer B = new TopicSubscriber("B", topic);
        Observer C = new TopicSubscriber("C", topic);

        topic.register(A);
        topic.register(B);
        topic.register(C);

        topic.postMessage("악뮤 신곡 발매했다.");

    }
}
