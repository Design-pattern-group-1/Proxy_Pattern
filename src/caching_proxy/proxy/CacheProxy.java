package caching_proxy.proxy;

import caching_proxy.service_package.DataObject;
import caching_proxy.service_package.DataRetriever;
import caching_proxy.service_package.DataRetrieverInterface;

import java.util.HashMap;

public class CacheProxy implements DataRetrieverInterface {

    private DataRetrieverInterface serviceObject;
    private HashMap<String, DataObject> dataCache;

    //Statistics
    private int dataUse;
    private int dataSaved;

    public CacheProxy() {
        this.serviceObject = new DataRetriever();
        this.dataCache = new HashMap<String, DataObject>();
        this.dataUse = 0;
        this.dataSaved = 0;
    }

    @Override
    public DataObject getDataObject(String id) {
        DataObject dataObject = dataCache.get(id);
        if (dataObject==null) {
            dataObject = serviceObject.getDataObject(id);
            dataCache.put(id, dataObject);
            dataUse += dataObject.size;
        } else {
            System.out.println("Data with ID: \"" + dataObject.name + "\" " +
                    "and size: \"" + dataObject.size + "\" retrieved from cache");
            dataSaved += dataObject.size;
        }
        showStatistics();
        return dataObject;
    }

    public void showStatistics() {
        System.out.println("Proxy: Total data retrieved: " + this.dataUse);
        System.out.println("Proxy: Total data saved: " + this.dataSaved);
    }
}
