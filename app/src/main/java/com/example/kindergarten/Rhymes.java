package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;


public class Rhymes extends AppCompatActivity {
    VideoView videoview;
    ListView video;
    ArrayList<String>videolist;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);
videoview=findViewById(R.id.videoview);
video=findViewById(R.id.video);
    videolist=new ArrayList<>();
        videolist.add("TWINKLE TWINKLE LITTLE STAR");
        videolist.add("BABA BLACKSHIP HAVE YOU ANY WOOL");
        videolist.add("BABY SHARK");
        videolist.add("ABC SONG ");
        videolist.add("TEN LITTLE DUCKS");
        videolist.add("LAKDI KI KATHI");
        videolist.add("CYCLE MARI");
        videolist.add("HUSH A BYE BABY");
        videolist.add("BATH SONG");
        videolist.add("OLD MCDONALD");
        getSupportActionBar().setTitle("Rhymes" );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,videolist);
        video.setAdapter(adapter);
        video.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.twinkle));
                    break;
                    case 1:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.babablackship));
                        break;
                    case 2:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.babyshark));
                        break;
                    case 3:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abcsong));
                        break;
                    case 4:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.ducks));
                        break;
                    case 5:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.lakdikikathi));
                        break;
                    case 6:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.cyclemari));
                        break;
                    case 7:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.hushbaby));
                        break;
                    case 8:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bathsong));
                        break;
                    case 9:
                        videoview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.snowman));
                        break;
                    default:
                        break;
                }
                videoview.setMediaController(new MediaController(Rhymes.this));
                videoview.requestFocus();
                 videoview.start();
            }
        });
    }
}