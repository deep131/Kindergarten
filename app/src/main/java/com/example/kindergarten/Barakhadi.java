package com.example.kindergarten;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kindergarten.numericmode.numericmodel;

import java.util.ArrayList;

public class Barakhadi extends AppCompatActivity {
    Button previous,next;
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
        getSupportActionBar().setTitle("Barakhadi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //sound=findViewById(R.id.sound);
        //sound.setOnClickListener(new View.OnClickListener() {
         /*   @Override
            public void onClick(View v) {
                AudioPlayer ap=new AudioPlayer();
                ap.play(Barakhadi.this,numericmodels.get(viewPager.getCurrentItem()).getAudio());
            }
        });*/

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
        numericmodel nm27=new numericmodel();
        numericmodel nm28=new numericmodel();
        numericmodel nm29=new numericmodel();
        numericmodel nm30=new numericmodel();
        //31
        numericmodel nm31=new numericmodel();
        numericmodel nm32=new numericmodel();
        numericmodel nm33=new numericmodel();
        numericmodel nm34=new numericmodel();



        //0
        nm1.setImages(R.drawable.ka);
        nm2.setImages(R.drawable.kha);
        nm3.setImages(R.drawable.ga);
        nm4.setImages(R.drawable.gha);
        nm5.setImages(R.drawable.cha);
        nm6.setImages(R.drawable.chhaaa);
        nm7.setImages(R.drawable.ja);
        nm8.setImages(R.drawable.zaa);
        nm9.setImages(R.drawable.ta);
        nm10.setImages(R.drawable.tha);
        //11
        nm11.setImages(R.drawable.daaa);
        nm12.setImages(R.drawable.dha);
        nm13.setImages(R.drawable.anaaa);
        nm14.setImages(R.drawable.t);
        nm15.setImages(R.drawable.th);
        nm16.setImages(R.drawable.da);
        nm17.setImages(R.drawable.dhaaa);
        nm18.setImages(R.drawable.naa);
        nm19.setImages(R.drawable.paaa);
        nm20.setImages(R.drawable.faaa);
        //21
        nm21.setImages(R.drawable.baa);
        nm22.setImages(R.drawable.bhaa);
        nm23.setImages(R.drawable.maa);
        nm24.setImages(R.drawable.yaa);
        nm25.setImages(R.drawable.ra);
        nm26.setImages(R.drawable.la);
        nm27.setImages(R.drawable.va);
        nm28.setImages(R.drawable.sha);
        nm29.setImages(R.drawable.shaa);
        nm30.setImages(R.drawable.sa);

        //31
        nm31.setImages(R.drawable.ha);
        nm32.setImages(R.drawable.ada);
        nm33.setImages(R.drawable.khsha);
        nm34.setImages(R.drawable.ghny);





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
        numericmodels.add(nm27);
        numericmodels.add(nm28);
        numericmodels.add(nm29);
        numericmodels.add(nm30);

        numericmodels.add(nm31);
        numericmodels.add(nm32);
        numericmodels.add(nm33);
        numericmodels.add(nm34);



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
                if(position==33)
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
