package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kindergarten.numericmode.numericmodel;

import java.util.ArrayList;

public class Alphabates extends AppCompatActivity {
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

        getSupportActionBar().setTitle("Alphabets");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AudioPlayer ap=new AudioPlayer();
                ap.play(Alphabates.this,numericmodels.get(viewPager.getCurrentItem()).getAudio());
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
        //11
        numericmodel nm11=new numericmodel();
        numericmodel nm12=new numericmodel();
        numericmodel nm13=new numericmodel();
        numericmodel nm14=new numericmodel();
        numericmodel nm15=new numericmodel();
        numericmodel nm16=new numericmodel();
        numericmodel nm17=new numericmodel();
        numericmodel nm18=new numericmodel();
        numericmodel nm19=new numericmodel();
        numericmodel nm20=new numericmodel();
        //21
        numericmodel nm21=new numericmodel();
        numericmodel nm22=new numericmodel();
        numericmodel nm23=new numericmodel();
        numericmodel nm24=new numericmodel();
        numericmodel nm25=new numericmodel();
        numericmodel nm26=new numericmodel();



        //0
        nm1.setImages(R.drawable.a);
        nm2.setImages(R.drawable.b);
        nm3.setImages(R.drawable.c);
        nm4.setImages(R.drawable.d);
        nm5.setImages(R.drawable.e);
        nm6.setImages(R.drawable.f);
        nm7.setImages(R.drawable.g);
        nm8.setImages(R.drawable.h);
        nm9.setImages(R.drawable.i);
        nm10.setImages(R.drawable.j);
        //11
        nm11.setImages(R.drawable.k);
        nm12.setImages(R.drawable.l);
        nm13.setImages(R.drawable.m);
        nm14.setImages(R.drawable.n);
        nm15.setImages(R.drawable.o);
        nm16.setImages(R.drawable.p);
        nm17.setImages(R.drawable.q);
        nm18.setImages(R.drawable.r);
        nm19.setImages(R.drawable.s);
        nm20.setImages(R.drawable.tata);
        //21
        nm21.setImages(R.drawable.u);
        nm22.setImages(R.drawable.v);
        nm23.setImages(R.drawable.w);
        nm24.setImages(R.drawable.x);
        nm25.setImages(R.drawable.y);
        nm26.setImages(R.drawable.z);




        nm1.setAudio(R.raw.aa);
        nm2.setAudio(R.raw.bb);
        nm3.setAudio(R.raw.cc);
        nm4.setAudio(R.raw.dd);
        nm5.setAudio(R.raw.ee);
        nm6.setAudio(R.raw.ff);
        nm7.setAudio(R.raw.gg);
        nm8.setAudio(R.raw.hh);
        nm9.setAudio(R.raw.ii);
        nm10.setAudio(R.raw.jj);

        nm11.setAudio(R.raw.kk);
        nm12.setAudio(R.raw.ll);
        nm13.setAudio(R.raw.mm);
        nm14.setAudio(R.raw.nn);
        nm15.setAudio(R.raw.oo);
        nm16.setAudio(R.raw.pp);
        nm17.setAudio(R.raw.qq);
        nm18.setAudio(R.raw.rr);
        nm19.setAudio(R.raw.ss);
        nm20.setAudio(R.raw.tt);

        nm21.setAudio(R.raw.uu);
        nm22.setAudio(R.raw.vv);
        nm23.setAudio(R.raw.ww);
        nm24.setAudio(R.raw.xx);
        nm25.setAudio(R.raw.yy);
        nm26.setAudio(R.raw.zz);





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


        numericmodels.add(nm11);
        numericmodels.add(nm12);
        numericmodels.add(nm13);
        numericmodels.add(nm14);
        numericmodels.add(nm15);
        numericmodels.add(nm16);
        numericmodels.add(nm17);
        numericmodels.add(nm18);
        numericmodels.add(nm19);
        numericmodels.add(nm20);




        numericmodels.add(nm21);
        numericmodels.add(nm22);
        numericmodels.add(nm23);
        numericmodels.add(nm24);
        numericmodels.add(nm25);
        numericmodels.add(nm26);



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
                if(position==25)
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
