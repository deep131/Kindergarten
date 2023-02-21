package com.example.kindergarten;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kindergarten.numericmode.numericmodel;


public class Fragmentalpha extends Fragment {

    ImageView images;
    numericmodel numericmodel_new;

    public static  Fragmentalpha newInstance(numericmodel model){
        Fragmentalpha f1=new Fragmentalpha();
        f1.numericmodel_new=model;

        return f1;
    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmentalpha, container, false);
        images= v.findViewById(R.id.images);
        images.setImageResource(numericmodel_new.getImages());

        return v;

    }



}