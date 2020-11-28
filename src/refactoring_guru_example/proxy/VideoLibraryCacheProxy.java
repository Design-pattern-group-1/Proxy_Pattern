package refactoring_guru_example.proxy;

import refactoring_guru_example.video_library.VideoLibrary;
import refactoring_guru_example.video_library.VideoLibraryInterface;
import refactoring_guru_example.video_library.Video;

import java.util.HashMap;

public class VideoLibraryCacheProxy implements VideoLibraryInterface {
    private VideoLibraryInterface videoLibrary;
    private HashMap<String, Video> cachePopularVideos = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public VideoLibraryCacheProxy() {
        this.videoLibrary = new VideoLibrary();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopularVideos.isEmpty()) {
            cachePopularVideos = videoLibrary.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopularVideos;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = videoLibrary.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopularVideos.clear();
        cacheAll.clear();
    }
}
