package logging_proxy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

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
            FileWriter write = new FileWriter(path,true);
            PrintWriter print_line = new PrintWriter(write);
            print_line.println(status);
            write.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
