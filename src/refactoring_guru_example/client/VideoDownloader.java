package refactoring_guru_example.client;

import refactoring_guru_example.video_library.VideoLibraryInterface;
import refactoring_guru_example.video_library.Video;

import java.util.HashMap;

// A 3rd party app, that can be used to download video's from a video library. Rather than requiring a
// VideoLibrary object itself, it can use any object that provides these videos, as long as they implement the same
// interface (thus allowing for proxies).
public class VideoDownloader {
    private VideoLibraryInterface library;

    public VideoDownloader(VideoLibraryInterface library) {
        this.library = library;
    }

    // Proxy passes the hard work of to its service object (rendering the video).
    public void renderVideoPage(String videoId) {
        Video video = library.getVideo(videoId);

        System.out.println("\n------------------------------- +" +
                "\nVideo page" +
                "\nID: " + video.id +
                "\nTitle: " + video.title +
                "\nVideo: " + video.data);
    }

    public void showPopularVideos() {
        HashMap<String, Video> list = library.popularVideos();
        System.out.println("\n-------------------------------" +
                "\nList of popular videos");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}