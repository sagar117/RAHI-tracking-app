package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 7/28/2016.
 */

public class sub1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1);
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.v1a);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(sub1.this,v1.class);
                startActivity(a);
            }
        });
        RelativeLayout layout2 =(RelativeLayout)findViewById(R.id.v1b);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(sub1.this,v2.class);
                startActivity(a);
            }
        });
        RelativeLayout layout3 =(RelativeLayout)findViewById(R.id.v1c);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(sub1.this,v3.class);
                startActivity(a);
            }
        });
    }
}
