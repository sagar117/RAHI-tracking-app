package com.rahi.mhc.inotrans.fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 7/5/2016.
 */

public class Fragment4 extends Fragment {
    public Fragment4() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment4, container, false);

        Button newPage1 = (Button)rootView.findViewById(R.id.snbb);
        newPage1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        return rootView;
    }
//    public void onaclick(View view){
//        if (view.getId()==R.id.tracepath){
//            Intent a=new Intent(Fragment1.this,fragment.fragment.bustrace.class);
//            startActivity(a);
//        }
//    }
}