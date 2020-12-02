package logging_proxy;

public class Proxy implements ServiceInterface{
    private ServiceInterface serviceInterface;

    public Proxy(ServiceInterface serviceInterface){
        this.serviceInterface = serviceInterface;
    }
    private boolean checkAccess(){
        return true;
    }

    @Override
    public void Operation() {
        if (checkAccess()){
            serviceInterface.Operation();
        }
    }
}
