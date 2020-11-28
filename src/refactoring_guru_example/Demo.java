package refactoring_guru_example;

import refactoring_guru_example.video_library.VideoLibrary;
import refactoring_guru_example.client.VideoDownloader;
import refactoring_guru_example.proxy.VideoLibraryCacheProxy;

public class Demo {

    public static void main(String[] args) {
        // Media Downloader using the main service provider object.
        VideoDownloader naiveDownloader = new VideoDownloader(new VideoLibrary());
        //Media Downloader using the proxy service (with caching functionality).
        VideoDownloader smartDownloader = new VideoDownloader(new VideoLibraryCacheProxy());

        //
        long directConnection = test(naiveDownloader);
        long cacheProxyConnection = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (directConnection - cacheProxyConnection) + "ms");

    }


    // Runs a test, using whatever downloader is provided.
    private static long test(VideoDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.showPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.showPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
