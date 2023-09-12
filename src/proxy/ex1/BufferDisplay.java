package proxy.ex1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class BufferDisplay implements Display {

    private List<String> buffer = new ArrayList<String>();
    private ScreenDisplay screen; // target객체 소유
    private int bufferSize;

    public BufferDisplay(int bufferSize) { //생성될 때 버퍼크기 정하도록 설정
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
            buffer.add(content);
            if(buffer.size() == bufferSize){
                flush();
            }
    }

    public void flush() {

        if(screen == null) {
            screen = new ScreenDisplay();
        }

        //출력용 전처리
        String lines = String.join("\n", buffer); //join 메서드 개꿀 (elemnts사이에 delimiter끼워넣어줌 맨 앞, 맨 뒤 고려안해도 됨)

        screen.print(lines); // 여기가 target객체 기능 이용

        buffer.clear();



    }
}
