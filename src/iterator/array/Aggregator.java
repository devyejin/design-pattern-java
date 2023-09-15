package iterator.array;

import iterator.array.Iterator;

/*
    순회가능한 객체를 한 번 더 추상화한 인터페이스 -> Aggregator
 */
public interface Aggregator {

    //Aggregator가 Iterator를 생성하는 메서드
    Iterator iterator();
}
