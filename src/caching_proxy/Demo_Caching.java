package caching_proxy;

import caching_proxy.client.ClientApp;
import caching_proxy.proxy.CacheProxy;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo_Caching {

    public static void main(String[] args) {

        ClientApp app = new ClientApp(new CacheProxy());
        run(app);

    }


    private static void run(ClientApp app) {
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("CrazyCatVideo",
                        "SomethingAboutPolitics",
                        "EvenMoreCatVideos",
                        "GiantMiniatureSpaceHamster",
                        "IsSomeoneActuallyReadingThese?",
                        "EvenMoreCatVideos",
                        "CrazyCatVideo",
                        "SomeOtherVideo")
        );

        for (String string : list) {
            app.displayData(string);
        }
    }
}
