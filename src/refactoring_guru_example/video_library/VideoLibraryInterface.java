package refactoring_guru_example.video_library;

import java.util.HashMap;

// Interface for video library objects objects. Libraries can
public interface VideoLibraryInterface {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}