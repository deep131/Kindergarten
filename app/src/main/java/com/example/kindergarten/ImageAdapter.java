package com.example.kindergarten;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.kindergarten.numericmode.numericmodel;

import java.util.ArrayList;

class  ImageAdapter extends FragmentStatePagerAdapter {

  ArrayList<numericmodel> list ;



    public ImageAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<numericmodel> model) {
        super(fm, behavior);
        list=model;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return Fragmentalpha.newInstance(list.get(position));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public static void addFragment(Fragment fragment, String title){

      /*  fragmentArrayList.add(fragment);
        fragmentTitle.add(title);*/
    }

   /* @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }*/
}
