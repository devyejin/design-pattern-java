package iterator.array;

public class ArrayIterator implements Iterator {

    private Array array;
    private int index;

    public ArrayIterator(Array array) {
        this.array = array;
        this.index = -1; //hasNext() 할 때 다음에 존재하는값 읽어서?
    }


    @Override
    public boolean next() {
        index++;
        return index < array.getCount(); // 전체 길이보다 작아야 다음 값이 존재
    }

    @Override
    public Object current() {
        return array.getItem(index);
    }
}
