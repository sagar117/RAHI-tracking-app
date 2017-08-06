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
public class Fragment3 extends Fragment {
    public Fragment3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3, container, false);

        Button newPage = (Button)rootView.findViewById(R.id.button3);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bustrace.class);
                startActivity(intent);
            }
        });

        Button newPage1 = (Button)rootView.findViewById(R.id.button4);
        newPage1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), journeyplan.class);
                startActivity(intent);
            }
        });

        Button newPage2 = (Button)rootView.findViewById(R.id.button5);
        newPage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), nearby.class);
                startActivity(intent);
            }
        });
        Button newPage3 = (Button)rootView.findViewById(R.id.button6);
        newPage3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), directory1.class);
                startActivity(intent);
            }
        });
        Button newPage4 = (Button)rootView.findViewById(R.id.button7);
        newPage4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), adata.class);
//                startActivity(intent);
            }
        });
        return rootView;
    }
}

