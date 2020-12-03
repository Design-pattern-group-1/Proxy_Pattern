package logging_proxy;

public class Demo_Tom {

    public static void main(String[] args) {
        Client Rick= new Client(new Proxy(new Service(),"Proxy_Pattern\\src\\LoggingProxy\\Reports.txt"));
        Rick.pressButton();
    }
}
