package com.ensah.androidprojet.NousPartageons.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ensah.androidprojet.NousPartageons.R;


public class RequestsFragment extends Fragment {


    public RequestsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_requests, container, false);
    }

}
