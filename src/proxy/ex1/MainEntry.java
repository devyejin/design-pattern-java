package proxy.ex1;

public class MainEntry {

    public static void main(String[] args) {
//        Display display = new ScreenDisplay();
        //프록시 패턴
        Display display = new BufferDisplay(5);

        display.print("1");
        display.print("2");
        display.print("3");
        display.print("4");
        display.print("5"); //<-- flush 동작 + clear
        display.print("6"); //<-- 버퍼에 다시 넣음
        display.print("7");


//        display.flush(); <--가 아닌 이유는, Display 인터페이스타입이 아닌 BufferDispaly만 가진 메서드(기능)이니까.
//        그래서 밑에서는 형변환 해서 호출!
        ((BufferDisplay)display).flush();

        //버퍼 크기와 상관없이 버퍼에 있는 데이터 출력

    }

    //ScreenDisplay객체(target)의 출력 속도가 느려
    //버퍼 기능을 가진  BufferDisplay 객체를 이용해서 성능 속도 향상
}
