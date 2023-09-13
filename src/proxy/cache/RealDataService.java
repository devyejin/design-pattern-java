package proxy.cache;

public class RealDataService implements DataService {
    @Override
    public String fetchData(String key) {

        //실제 서버나 DB에 접근에서 데이터를 가져온다 가정
        return "Data for key " + key;
    }
}
