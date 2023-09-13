package proxy.cache;

import java.util.HashMap;
import java.util.Map;

public class CacheProxyDataService implements DataService {

    private RealDataService realDataService;
    private Map<String,String> cache = new HashMap<>();

    public CacheProxyDataService(RealDataService realDataService) {
        this.realDataService = realDataService;
    }

    @Override
    public String fetchData(String key) {

        //캐시에서 데이터를 찾아보고, 없으면 실제 데이터를 가져오기
        if(cache.containsKey(key)) {
            return "Cached Data for key: " + key + " => " + cache.get(key);
        } else {
            String data = realDataService.fetchData(key);
            cache.put(key,data); //캐시에 데이터 저장
            return "Data for key : " + key + " => " + cache.get(key);
        }
    }
}
