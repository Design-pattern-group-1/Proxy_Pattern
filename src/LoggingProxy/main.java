package LoggingProxy;

public class main {
    public static void main(String[] args) {
        Client Hamster= new Client(new Proxy(new Service(),"Proxy_Pattern\\src\\LoggingProxy\\Reports.txt"));
        Hamster.pressButton();
    }

}
