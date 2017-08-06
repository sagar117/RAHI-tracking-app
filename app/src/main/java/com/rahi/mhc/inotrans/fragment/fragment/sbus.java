package com.rahi.mhc.inotrans.fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.rahi.mhc.inotrans.R;

/**
 * Created by MHC on 7/28/2016.
 */

public class sbus extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sbus);
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.s1);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(sbus.this, sub1.class);
                startActivity(a);
            }
        });
        RelativeLayout layout1=(RelativeLayout)findViewById(R.id.s2);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(sbus.this, sub1.class);
                startActivity(a);
            }
        });

        RelativeLayout layout3=(RelativeLayout)findViewById(R.id.s3);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(sbus.this, sub1.class);
                startActivity(a);
            }
        });
        Button btn1=(Button)findViewById(R.id.button82);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int position = 0;
                String g=Integer.toString(position);

                Intent intent = new Intent(sbus.this, MapsActivity.class);

                String  a = null;
                if (g==null) {
                    intent.putExtra("a", 5);
                }else{
                    intent.putExtra("a", g);
                    Toast.makeText(sbus.this, g,
                            Toast.LENGTH_LONG).show();
                }
                startActivity(intent);
            }
        });
        Button btn2=(Button)findViewById(R.id.sec2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int position = 1;
                String g=Integer.toString(position);

                Intent intent = new Intent(sbus.this, MapsActivity.class);

                String  a = null;
                if (g==null) {
                    intent.putExtra("a", 5);
                }else{
                    intent.putExtra("a", g);
                    Toast.makeText(sbus.this, g,
                            Toast.LENGTH_LONG).show();
                }
                startActivity(intent);
            }
        });

        Button btn3=(Button)findViewById(R.id.thir2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int position = 2;
                String g=Integer.toString(position);

                Intent intent = new Intent(sbus.this, MapsActivity.class);

                String  a = null;
                if (g==null) {
                    intent.putExtra("a", 5);
                }else{
                    intent.putExtra("a", g);
                    Toast.makeText(sbus.this, g,
                            Toast.LENGTH_LONG).show();
                }
                startActivity(intent);
            }
        });



    }

    public void onClick(View view) {
        if (view.getId() == R.id.s1) {
            Intent a = new Intent(sbus.this, sub1.class);
            startActivity(a);

        } else if (view.getId() == R.id.s2) {
            Intent b = new Intent(sbus.this, sub2.class);
            startActivity(b);

        } else if (view.getId() == R.id.s3) {
            Intent c = new Intent(sbus.this, sub3.class);
            startActivity(c);

        } else {
        }

    }
}

