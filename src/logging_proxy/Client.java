package logging_proxy;

public class Client {

    private ServiceInterface serviceProxy;

    public Client(ServiceInterface serviceProxy){
        this.serviceProxy = serviceProxy;
    }
    public void pressButton(){
        serviceProxy.Operation();
    }
}
