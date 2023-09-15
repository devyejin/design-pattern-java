package iterator.array;

public class MainEntry {

    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU",1000),
                new Item("RAM",2000),
                new Item("SSD",3000),
                new Item("MOUSE",4000)
        };

        Array array = new Array(items);

        Iterator it = array.iterator();

        while(it.next()) {
            System.out.println(it.current());
        }
    }
}
