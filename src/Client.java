public class Client {

    private ServiceInterface serviceInterface;

    public Client(ServiceInterface serviceInterface){
        this.serviceInterface= serviceInterface;
    }
    public void pressButton(){
        serviceInterface.Operation();
    }
}
