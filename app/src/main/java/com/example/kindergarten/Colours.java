package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kindergarten.numericmode.numericmodel;

import java.util.ArrayList;

public class Colours extends AppCompatActivity {
    Button previous,next,sound;
    ViewPager viewPager;
    ArrayList<numericmodel> numericmodels=new ArrayList<>();
    int page=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        viewPager = findViewById(R.id.viewPager);
        previous=findViewById(R.id.previous);
        next=findViewById(R.id.next);
        sound=findViewById(R.id.sound);
        getSupportActionBar().setTitle("Colours");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioPlayer ap=new AudioPlayer();
                ap.play(Colours.this,numericmodels.get(viewPager.getCurrentItem()).getAudio());
            }
        });

        previous.setVisibility(View.GONE);
        pageChange();


        numericmodel nm1=new numericmodel();
        numericmodel nm2=new numericmodel();
        numericmodel nm3=new numericmodel();
        numericmodel nm4=new numericmodel();
        numericmodel nm5=new numericmodel();
        numericmodel nm6=new numericmodel();
        numericmodel nm7=new numericmodel();
        numericmodel nm8=new numericmodel();
        numericmodel nm9=new numericmodel();
        numericmodel nm10=new numericmodel();


        nm1.setImages(R.drawable.blue);
        nm2.setImages(R.drawable.yellow);
        nm3.setImages(R.drawable.red);
        nm4.setImages(R.drawable.green);
        nm5.setImages(R.drawable.black);
        nm6.setImages(R.drawable.brown);
        nm7.setImages(R.drawable.orange);
        nm8.setImages(R.drawable.pink);
        nm9.setImages(R.drawable.purple);
        nm10.setImages(R.drawable.white);

        nm1.setAudio(R.raw.blue);
        nm2.setAudio(R.raw.yellow);
        nm3.setAudio(R.raw.red);
        nm4.setAudio(R.raw.green);
        nm5.setAudio(R.raw.black);
        nm6.setAudio(R.raw.brown);
        nm7.setAudio(R.raw.orange);
        nm8.setAudio(R.raw.pink);
        nm9.setAudio(R.raw.purple);
        nm10.setAudio(R.raw.white);




        numericmodels.add(nm1);
        numericmodels.add(nm2);
        numericmodels.add(nm3);
        numericmodels.add(nm4);
        numericmodels.add(nm5);
        numericmodels.add(nm6);
        numericmodels.add(nm7);
        numericmodels.add(nm8);
        numericmodels.add(nm9);
        numericmodels.add(nm10);


        ImageAdapter imgadapter = new ImageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,numericmodels);

        viewPager.setAdapter(imgadapter);
    }

    //previous and next button


    public void prev(View view){
        viewPager.setCurrentItem(viewPager.getCurrentItem()-1,true);
    }
    public void next(View view){
        viewPager.setCurrentItem(viewPager.getCurrentItem()+1,true);
    }

    //page change listner

    void pageChange() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                page=position;
                if(position == 0){
                    previous.setVisibility(View.GONE);
                }
                else{
                    previous.setVisibility(View.VISIBLE);
                }
                if(position==9)
                {
                    next.setVisibility(View.GONE);
                }
                else{
                    next.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
