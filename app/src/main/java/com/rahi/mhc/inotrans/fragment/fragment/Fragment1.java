package com.rahi.mhc.inotrans.fragment.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 6/12/2016.
 */
public class Fragment1 extends Fragment {
    public Fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1, container, false);

        Button newPage = (Button)rootView.findViewById(R.id.tracepath);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bustrace.class);
                startActivity(intent);
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
