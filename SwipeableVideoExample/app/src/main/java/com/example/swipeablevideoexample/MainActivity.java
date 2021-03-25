package com.example.swipeablevideoexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);
        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem videoItemCelebration1 = new VideoItem();
        videoItemCelebration1.videoURL = "https://static.videezy.com/system/resources/previews/000/044/398/original/Film_Reel.mp4";
        videoItemCelebration1.videoTitle = "Scrolling Video 1";
        videoItemCelebration1.videoDescription = "Some description for the video 1";


        VideoItem videoItemCelebration2 = new VideoItem();
        videoItemCelebration2.videoURL = "https://static.videezy.com/system/resources/previews/000/044/398/original/Film_Reel.mp4";
        videoItemCelebration2.videoTitle = "Scrolling Video 2";
        videoItemCelebration2.videoDescription = "Some description for the video 2";

        VideoItem videoItemCelebration3 = new VideoItem();
        videoItemCelebration3.videoURL = "https://static.videezy.com/system/resources/previews/000/044/398/original/Film_Reel.mp4";
        videoItemCelebration3.videoTitle = "Scrolling Video 3";
        videoItemCelebration3.videoDescription = "Some description for the video 3";

        videoItems.add(videoItemCelebration1);
        videoItems.add(videoItemCelebration2);
        videoItems.add(videoItemCelebration3);

        videosViewPager.setAdapter(new VideosAdapter(videoItems));
    }
}