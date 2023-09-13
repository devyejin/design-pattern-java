package proxy.display;

//ScreenDisplay 객체의 경우, 출력할 때 준비시간이 상당시간 소요된다 가정
public class ScreenDisplay implements Display {
    @Override
    public void print(String content) {
            try {
                Thread.sleep(500); //출력 준비 작업
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println(content);
    }
}
