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
public class Fragment2 extends Fragment  {
    public Fragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag2, container, false);
        Button newPage = (Button)rootView.findViewById(R.id.jplan);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), journeyplan.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
