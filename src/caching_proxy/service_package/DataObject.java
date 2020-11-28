package caching_proxy.service_package;

public class DataObject {
    public String name;
    public int size;

    public DataObject(String name) {
        this.name = name;
        this.size = random(50, 500);
    }

    //Fake Methods
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}
