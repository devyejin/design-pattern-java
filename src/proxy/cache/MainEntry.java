package proxy.cache;

public class MainEntry {

    public static void main(String[] args) {
        DataService dataService = new CacheProxyDataService(new RealDataService());


        System.out.println(dataService.fetchData("find")); //Data for key : find => Data for key find
        System.out.println(dataService.fetchData("find")); //Cached Data for key: find => Data for key find

        System.out.println(dataService.fetchData("search")); //Data for key : search => Data for key search
        System.out.println(dataService.fetchData("search")); //Cached Data for key: search => Data for key search
        System.out.println(dataService.fetchData("search")); //Cached Data for key: search => Data for key search
    }

}
