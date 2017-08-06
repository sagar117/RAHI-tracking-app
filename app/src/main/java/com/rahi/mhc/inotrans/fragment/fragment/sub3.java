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

public class sub3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub3);
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.v3a);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(sub3.this,v7.class);
                startActivity(a);
            }
        });
        RelativeLayout layout2 =(RelativeLayout)findViewById(R.id.v3b);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(sub3.this,v8.class);
                startActivity(a);
            }
        });
        RelativeLayout layout3 =(RelativeLayout)findViewById(R.id.v3c);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(sub3.this,v9.class);
                startActivity(a);
            }
        });
    }
}
