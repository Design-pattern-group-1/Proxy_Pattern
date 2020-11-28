package caching_proxy.service_package;

public class DataRetriever implements DataRetrieverInterface {
    @Override
    public DataObject getDataObject(String id) {
        DataObject dataObject = new DataObject(id);
        System.out.println("Getting data with ID: " + id + " from Database");
        return dataObject;
    }
}
