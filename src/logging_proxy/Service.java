package logging_proxy;

public class Service implements ServiceInterface{
    @Override
    public String Operation() {
        return "Executing operation";
    }
}
