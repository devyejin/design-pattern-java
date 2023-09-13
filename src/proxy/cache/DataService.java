package proxy.cache;
/*
    캐시 프록시 패턴(Cache Proxy Pattern)

    프록시 객체가 실제 서비스 객체로부터 받은 결과를 캐시에 저장,
    이후 동일한 요청이 들어올 때 캐시에서 결과를 반환하는 패턴
    => 자원을 효율적으로 활용, 빠른 응답 속도 제공 가능
    => ex) 웹 페이지는 수많은 사용자가 접근, 모든 요청마다 db에서 데이터를 가져온다면 비효율적, 성능 저하
           동일한 요청에 대해서는 캐시(프록시)에서 데이터를 반환
           db, 원격 서버에 접근 빈도를 줄이고, 빠른 응답 속도 제공 가능
 */

public interface DataService {

    String fetchData(String key);

}
