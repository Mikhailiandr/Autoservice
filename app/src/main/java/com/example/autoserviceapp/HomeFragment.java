package com.example.autoserviceapp;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    Button buttonRepairEngine;
    private FragmentDataListener fragmentDataListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_home, container, false);
       buttonRepairEngine = view.findViewById(R.id.buttonRepairEngine);

        buttonRepairEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentDataListener.openOrderDetailsFragment();
            }
        });

       return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentDataListener) {
            fragmentDataListener = (FragmentDataListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragment1DataListener");
        }
    }

}
