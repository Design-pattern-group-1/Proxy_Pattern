package caching_proxy.client;

import caching_proxy.service_package.DataObject;
import caching_proxy.service_package.DataRetrieverInterface;

public class ClientApp {
    private DataRetrieverInterface dataRetriever;

    public ClientApp(DataRetrieverInterface dataRetriever) {
        this.dataRetriever = dataRetriever;
    }

    public void displayData(String id){
        DataObject data = dataRetriever.getDataObject(id);
        System.out.println("File with id: " + id + " is: " + data.size + "mb");
        System.out.println("-------------------------------------------------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
