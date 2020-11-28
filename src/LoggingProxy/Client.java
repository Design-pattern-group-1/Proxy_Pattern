package LoggingProxy;

public class Client {
    ServiceInterface serviceProxy;

    public Client(ServiceInterface serviceInterface){
        this.serviceProxy= serviceInterface;
    }
    public void pressButton(){
        serviceProxy.Operation();
    }
}
