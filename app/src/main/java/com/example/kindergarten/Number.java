package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kindergarten.numericmode.numericmodel;

import java.util.ArrayList;

public class Number extends AppCompatActivity {
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
        getSupportActionBar().setTitle("Numbers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioPlayer ap=new AudioPlayer();
                ap.play(Number.this,numericmodels.get(viewPager.getCurrentItem()).getAudio());
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


        nm1.setImages(R.drawable.one);
        nm2.setImages(R.drawable.two);
        nm3.setImages(R.drawable.three);
        nm4.setImages(R.drawable.four);
        nm5.setImages(R.drawable.five);
        nm6.setImages(R.drawable.six);
        nm7.setImages(R.drawable.seven);
        nm8.setImages(R.drawable.eight);
        nm9.setImages(R.drawable.nine);
        nm10.setImages(R.drawable.ten);

        nm1.setAudio(R.raw.onetone);
        nm2.setAudio(R.raw.twotone);
        nm3.setAudio(R.raw.threetone);
        nm4.setAudio(R.raw.fourtone);
        nm5.setAudio(R.raw.fivetone);
        nm6.setAudio(R.raw.sixtone);
        nm7.setAudio(R.raw.seventone);
        nm8.setAudio(R.raw.eighttone);
        nm9.setAudio(R.raw.ninetone);
        nm10.setAudio(R.raw.tentone);




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
