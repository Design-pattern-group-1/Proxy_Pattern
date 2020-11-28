package LoggingProxy;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Proxy implements ServiceInterface{

    private ServiceInterface serviceInterface;
    private String path;

    public Proxy(ServiceInterface serviceInterface, String path){
        this.serviceInterface = serviceInterface;
        this.path = path;
    }

    @Override
    public String Operation() {
        reportStatus("Starting operation");
        reportStatus(serviceInterface.Operation());
        reportStatus("Operation ended");
        return null;
    }

    public void reportStatus(String status){
        try{
            FileWriter write = new FileWriter(path);
            PrintWriter print_line = new PrintWriter(write);
            print_line.println(status);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
